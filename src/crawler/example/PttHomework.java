package crawler.example;

import com.github.abola.crawler.CrawlerPack;


/**
 * 簡易練習
 * 
 * 找出所有文章中按推的id
 * 
 * @author Abola Lee
 *
 */
public class PttHomework {
	
	public static void main(String[] args) {
		String uri = "https://www.ptt.cc/bbs/Gossiping/M.1459039136.A.8E7.html";
		

		System.out.println( 
			CrawlerPack.start()
			    .addCookie("over18", "1")
				.getFromHtml(uri)
		      //.select("span:contains(噓)+.hl, span:contains(噓)+.push-content") // 如何取得按推的id ? >>>Fill here<<< 
			  //.select("span:contains(噓)+.hl, span:contains(噓)~.push-content")
				.select("span.hl:contains(推)")
				.toString()
		);
	}
}
