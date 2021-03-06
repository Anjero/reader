package net.anjero.reader.module.rss.kit;

import com.sun.syndication.feed.synd.*;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import java.net.URL;
import java.util.List;

/**
 * ///////////////////////////////////////
 * <p>Create by 2017/5/12</p>
 * <p>
 * 作为一个真正的程序员，首先应该尊重编程，<br/>
 * 热爱你所写下的程序，他是你的伙伴，而不是工具。
 * </p>
 * ///////////////////////////////////////
 *
 * @author :anjero
 * @version :1.0
 */
public class RssKit {

    public static void main(String[] args) {
        parseRss();
    }

    public static void parseRss() {

//      String rss = "http://news.baidu.com/n?cmd=1&class=civilnews&tn=rss&sub=0]http://news.baidu.com/n?cmd=1&class=civilnews&tn=rss&sub=0";
        String rss = "http://news.163.com/special/00011K6L/rss_newsattitude.xml";

        try {
            URL url = new URL(rss);
            // 读取Rss源
            XmlReader reader = new XmlReader(url);


            System.out.println("Rss源的编码格式为：" + reader.getEncoding());
            SyndFeedInput input = new SyndFeedInput();
            // 得到SyndFeed对象，即得到Rss源里的所有信息
            SyndFeed feed = input.build(reader);

            //System.out.println(feed);

            // 得到Rss新闻中子项列表
            List entries = feed.getEntries();
            // 循环得到每个子项信息
            for (int i = 0; i < entries.size(); i++) {
                SyndEntry entry = (SyndEntry) entries.get(i);


                // 标题、连接地址、标题简介、时间是一个Rss源项最基本的组成部分
                System.out.println("标题：" + entry.getTitle());
                System.out.println("连接地址：" + entry.getLink());
                SyndContent description = entry.getDescription();
                System.out.println("标题简介：" + description.getValue());
                System.out.println("发布时间：" + entry.getPublishedDate());


                // 以下是Rss源可先的几个部分
                System.out.println("标题的作者：" + entry.getAuthor());

                // 此标题所属的范畴
                List categoryList = entry.getCategories();
                if (categoryList != null) {
                    for (int m = 0; m < categoryList.size(); m++) {
                        SyndCategory category = (SyndCategory) categoryList.get(m);
                        System.out.println("此标题所属的范畴：" + category.getName());
                    }
                }


                // 得到流媒体播放文件的信息列表
                List enclosureList = entry.getEnclosures();
                if (enclosureList != null) {
                    for (int n = 0; n < enclosureList.size(); n++) {
                        SyndEnclosure enclosure = (SyndEnclosure) enclosureList.get(n);
                        System.out.println("流媒体播放文件：" + entry.getEnclosures());
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
