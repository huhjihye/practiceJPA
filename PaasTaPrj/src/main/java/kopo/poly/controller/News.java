package kopo.poly.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class News {
    public static void main(String[] args) throws IOException {
        String url="https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid2=252&sid1=102&date=20220922&page=1";

       Document doc = Jsoup.connect(url).get(); //doc변수 안에 url 담기
        Elements elements= doc.getElementsByAttributeValue("class","list_body newsflash_body");  //url에서 html에서 class가  list_body newsflash_body부분만 가져오기
        Element element=elements.get(0);
        System.out.println(element);

    }

}
