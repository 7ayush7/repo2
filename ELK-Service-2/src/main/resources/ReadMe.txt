Steps for ELK :

1. Download Elastic Search, Kibana, Logstash
2. Elastic search is a Lucene based search engine which is actually a NoSQL DB which helps in log aggregation
3. Logstash is pipeline which helps in transferring logs from various sources (Microservices) to one target (Elastic search)
4. Kibana is a UI layer which helps in visualisation of logs aggregated in elastic search vis logstash
5. Start Elastic search (localhost:9200)
6. Change .yml file in Kibana, uncomment the line where IP:Port of Elastic Search is mentioned
7. Start Kibana (localhost:5601)
8. Create logstash.conf file inside /bin in logstash directory
9. Start logstash (http://localhost:9600/)
10. Search for logstash index in elastic search -> http://localhost:9200/_cat/indices
11. Goto index page : http://localhost:9200/logstash-2020.09.09-000001/_search
12. Go to kibana UI
13. Go to Stack Management -> Kibana -> Index Patterns
14. Create new index (name of your index from elastic search) 
15. Add filters (If needed)
16. Go to discover page
17. Investigate your logs as per added filters