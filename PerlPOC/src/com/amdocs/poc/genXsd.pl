#! /usr/bin/env perl
use IO::File;

####### Subroutins ##############
sub GetAllObjectNames {
  for (my $i = 0; $i <= $size; $i++) {
    my $object = $xml_files[$i];
    $object =~ s/^.*\///g;
    $object =~ s/\.XsdMethods//g;
    $objects[$i] = $object;
  }
}

sub GenerateHeader {
  print $output_file '<?xml version="1.0" encoding="UTF-8"?>
<xsd:schema xmlns="CSG" xmlns:xsd="http://www.w3.org/2001/XMLSchema"
attributeFormDefault="unqualified" elementFormDefault="qualified" targetNamespace="CSG">
';
}

sub GenerateIncludes {
  for (my $i = 0; $i <= $size; $i++) {
    print $output_file "
  <xsd:include schemaLocation=\"$objects[$i].xsd\"/>";
  }
}

sub GenerateRequestHeader {
  print $output_file "
  <xsd:element name=\"$request\">
    <xsd:complexType>
      <xsd:sequence>";
}

sub GenerateRequestList {
  print $output_file '
        <xsd:element name="EnforceSubRequestRelationships" minOccurs="0" nillable="true" type="Boolean"/>
        <xsd:element name="RequestList">
          <xsd:complexType>
            <xsd:sequence>
              <xsd:choice maxOccurs="unbounded">';

  for (my $i = 0; $i <= $size; $i++) {
    print $output_file "
                <xsd:element name=\"$objects[$i]\" type=\"$objects[$i]Request\"/>";
  }

  print $output_file '
              </xsd:choice>
            </xsd:sequence> 
            <xsd:attribute fixed="list" type="xsd:string" name="e-dtype"/>
          </xsd:complexType>
        </xsd:element>
      </xsd:sequence>
    </xsd:complexType>
  </xsd:element>';
}

sub GenerateRequestTail {
  print $output_file "
              </xsd:sequence>
              <xsd:attribute fixed=\"list\" type=\"xsd:string\" name=\"e-dtype\"/>
            </xsd:complexType>
          </xsd:element>
        </xsd:sequence>
      </xsd:extension>
    </xsd:complexContent>
  </xsd:complexType>";
}

sub GenerateRequestHeaderType {
    print $output_file '
  <xsd:complexType name="RequestHeader">
    <xsd:sequence>
      <xsd:element name="RequestId" type="xsd:ID"/>
      <xsd:element name="InputRequest" minOccurs="0">
        <xsd:complexType>
          <xsd:sequence minOccurs="0">
            <xsd:element name="RequestId">
              <xsd:complexType>
                <xsd:simpleContent>
                  <xsd:extension base="xsd:IDREF">
                    <xsd:attribute name="e-dtype" type="xsd:string" fixed="string"/>
                  </xsd:extension>
                </xsd:simpleContent>
              </xsd:complexType>
            </xsd:element>
            <xsd:element name="RelationshipId">
              <xsd:complexType>
                <xsd:simpleContent>
                  <xsd:extension base="xsd:IDREF">
                    <xsd:attribute name="e-dtype" type="xsd:string" fixed="string"/>
                  </xsd:extension>
                </xsd:simpleContent>
              </xsd:complexType>
            </xsd:element>
          </xsd:sequence>
        </xsd:complexType>
      </xsd:element>
      <xsd:element name="InputRequestList" minOccurs="0">
        <xsd:complexType>
          <xsd:sequence>
            <xsd:element name="InputRequest" minOccurs="0">
              <xsd:complexType>
                <xsd:sequence minOccurs="0">
                  <xsd:element name="RequestId">
                    <xsd:complexType>
                      <xsd:simpleContent>
                        <xsd:extension base="xsd:IDREF">
                          <xsd:attribute name="e-dtype" type="xsd:string" fixed="string"/>
                        </xsd:extension>
                      </xsd:simpleContent>
                    </xsd:complexType>
                  </xsd:element>
                  <xsd:element name="RelationshipId">
                    <xsd:complexType>
                      <xsd:simpleContent>
                        <xsd:extension base="xsd:IDREF">
                          <xsd:attribute name="e-dtype" type="xsd:string" fixed="string"/>
                        </xsd:extension>
                      </xsd:simpleContent>
                    </xsd:complexType>
                  </xsd:element>
                </xsd:sequence>
              </xsd:complexType>
            </xsd:element>
          </xsd:sequence>
        </xsd:complexType>
      </xsd:element>
    </xsd:sequence>
  </xsd:complexType>
';
}

sub GenerateNoOpRequests {
  for (my $i = 0; $i <= $size; $i++) {
    print $output_file "
  <xsd:element name=\"$objects[$i]NoOpRequest\">
    <xsd:complexType>
      <xsd:choice minOccurs=\"1\" maxOccurs=\"1\">";

    my $xml_file_name = $xml_files[$i];

    my $xml_file = new IO::File($xml_file_name, "r")
      or die "Can't read $xml_file_name";
    foreach my $input_line (<$xml_file>) {
      chomp $input_line;
      print $output_file "
        <xsd:element ref=\"$input_line";
      print $output_file "Response\"/>";
    }

    print $output_file "
      </xsd:choice>
    </xsd:complexType>
  </xsd:element>";
  }
}

sub GenerateRequests {
  for (my $i = 0; $i <= $size; $i++) {
    print $output_file "
  <xsd:complexType name=\"$objects[$i]Request\">
    <xsd:complexContent>
      <xsd:extension base=\"RequestHeader\">
        <xsd:sequence minOccurs=\"0\">
          <xsd:choice>
            <xsd:element ref=\"$objects[$i]NoOpRequest\"/>";

    my $xml_file_name = $xml_files[$i];

    my $xml_file = new IO::File($xml_file_name, "r")
      or die "Can't read $xml_file_name";
    foreach my $input_line (<$xml_file>) {
      chomp $input_line;
      print $output_file "
            <xsd:element ref=\"$input_line\"/>";
    }

    print $output_file "
          </xsd:choice>
          <xsd:element name=\"SubRequest\" minOccurs=\"0\">
            <xsd:complexType>
              <xsd:sequence maxOccurs=\"unbounded\">";
    if ($objects[$i] ne 'Note') {
        print $output_file "
                <xsd:element name=\"$objects[$i]\" minOccurs=\"0\">
                  <xsd:complexType>
                    <xsd:complexContent>
                      <xsd:extension base=\"$objects[$i]Request\">
                        <xsd:sequence>
                          <xsd:element name=\"RelationshipId\" type=\"String\" fixed=\"SelfRequest\"/>
                        </xsd:sequence>
                      </xsd:extension>
                    </xsd:complexContent>
                  </xsd:complexType>
                </xsd:element>";
    }
    my $relFileName = $xml_files[$i];
    $relFileName =~ s/XsdMethods/XsdRel/g;
    my $relFile = new IO::File($relFileName, "r");
    my %subReqs = ();
    foreach my $input_line (<$relFile>) {
      chomp $input_line;
      (my $obj, my $rel) = split " ", $input_line;
      push (@{$subReqs{$obj}}, $rel);
    }
    foreach my $obj (sort keys %subReqs) {
      my $objReq = $obj . "Request";
      my @rels = @{$subReqs{$obj}};
      print $output_file "
                <xsd:element name=\"$objReq\" minOccurs=\"0\">
                  <xsd:complexType>
                    <xsd:complexContent>
                      <xsd:extension base=\"$objReq\">
                        <xsd:sequence>";
      if ($#rels eq 0) {
        print $output_file "
                          <xsd:element name=\"RelationshipId\" type=\"String\" fixed=\"$rels[0]\"/>";
      } else {
        print $output_file "
                          <xsd:choice>";
        foreach my $rel (@rels) {
          print $output_file "
                            <xsd:element name=\"RelationshipId\" type=\"String\" fixed=\"$rel\"/>";
        }
        print $output_file "
                          </xsd:choice>";
      }
      print $output_file "
                        </xsd:sequence>
                      </xsd:extension>
                    </xsd:complexContent>
                  </xsd:complexType>
                </xsd:element>";
    }
    GenerateRequestTail;
  }
}

sub GenerateTheEnd {
  print $output_file "
</xsd:schema>
";
}

###### Main Program Start ############
($out_file_name, $request) = @ARGV;
@objects = "";

@xml_files = sort glob('gen/*.XsdMethods');

$size=$#xml_files;

GetAllObjectNames;

$output_file = new IO::File("$out_file_name", "w")
   or die "Can't write $out_file_name";

GenerateHeader;

GenerateIncludes;

GenerateRequestHeader;

GenerateRequestList;

GenerateRequestHeaderType;

GenerateNoOpRequests;

GenerateRequests;

GenerateTheEnd;

close $output_file;
