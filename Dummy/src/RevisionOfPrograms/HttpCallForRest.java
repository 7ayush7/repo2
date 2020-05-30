package RevisionOfPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpCallForRest {

	public static void main(String[] args) {
		run1();
		run2();
		run3();
		run4();
		run5();
		run6();
		run7();
		run8();
		run9();
		run10();
//		run11();
//		run12();
//		run13();
//		run14();
//		run15();
//		run16();
//		run17();
//		run18();
//		run19();
//		run20();
//		run21();
//		run22();
//		run23();
//		run24();
//		run25();
//		run26();
//		run27();
//		run28();
//		run29();
//		run30();
//		run31();
//		run32();
//		run33();
//		run34();
//		run35();
//		run36();
//		run37();
//		run38();
//		run39();
//		run40();
	}

	private static void callAPI() throws IOException, InterruptedException {
		System.out.println("Thread : " + Thread.currentThread().getName());
		long entryTime = System.currentTimeMillis();
		URL url = new URL(
				"http://localhost:8080/fx_rest/oauth/token?grant_type=client_credentials&client_id=V9pvMGqMuTZb7unOCV9G9tCQJkaxhC1Y1KbD%2Bg%2FuS2xcJ8QISbCCNxZfh4PnVvM4oRrVmN%2FaGMtQB6%2F5owd4%2FD1IJmIes6QHTB8iDcEcFok%3D");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		con.setRequestProperty("Authorization", "Basic Vjlwdk1HcU11VFpiN3VuT0NWOUc5dENRSmtheGhDMVkxS2JEK2cvdVMyeGNKOFFJU2JDQ054WmZoNFBuVnZNNG9SclZtTi9hR010UUI2LzVvd2Q0L0QxSUptSWVzNlFIVEI4aURjRWNGb2s9OjUrNlRtWDNUajBaaFdQOTNKK1VUQXYwcCtPRkpLUGljWnRjSGxRNTdLVjArS25ua2orY1VkdFFWK1Y3MmdNb2xISmg2Wi90TFNwRVNHTWZGK2JNaGlGTUgxRCtrQ1gwUm8wMGkvOGcxc1hNPQ==");
		if (con.getResponseCode() == 200) {
			System.out.println("Got the response : " + con.getResponseCode());
			System.out.println("Got the response : " + con.getResponseMessage());
		} else {
			System.out.println("Failed : " + con.getResponseCode());
			System.out.println("Failed : " + con.getResponseMessage());
		}
		long exitTime = System.currentTimeMillis();
		System.out.println("Total time taken for API Call : " + (exitTime - entryTime));
		System.out.println();

	}

	private static void createThread(Runnable r) {
		Thread t = new Thread(r);
		t.start();
	}

	private static void run1() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run2() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run3() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run4() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run5() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run6() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run7() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run8() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run9() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run10() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run11() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run12() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run13() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run14() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run15() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run16() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run17() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run18() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run19() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run20() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run21() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run22() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run23() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run24() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run25() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run26() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run27() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run28() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run29() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}

	private static void run30() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run31() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run32() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run33() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run34() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run35() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run36() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run37() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run38() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run39() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
	private static void run40() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				try {
					callAPI();
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		createThread(r);
	}
}
