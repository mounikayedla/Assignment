import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class News {
int newsId;
String PostedByUser;
String CommentedByUser;
String Comment;
	public News(int i, String string, String string2, String string3) {
	this.newsId=newsId;
	this.PostedByUser=PostedByUser;
	this.CommentedByUser=CommentedByUser;
	this.Comment=Comment;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<News>l=new ArrayList<News>();
l.add(new News(11,"mounika","The climate change","yes"));
l.add(new News(12,"raj","The rain fall on mumbai","no,its sunny"));
l.add(new News(13,"sony","The virat posted something in his instagram ","yes,i am also seen that"));
l.add(new News(14,"byula","some political person got arrested","yes,on the basis of corruption"));
	
/*Stream<News> filtereddata=l.stream().filter(N->N.newsId==11);
filtereddata.forEach
(
		News ->{
			System.out.println(News.newsId);
			}
		);*/
	
/*1.Stream<News> filtereddata=l.stream().filter(N->N.CommentedByUser=="The climate change");
filtereddata.forEach
(
		News ->{
			System.out.println(News.CommentedByUser);
			}
				);*/
//-------------------------------------------------------------

/*2.Stream<News> filtereddata=l.stream().filter(N->N.PostedByUser=="mounika");
filtereddata.forEach
(
		news ->{
			System.out.println(news.PostedByUser);
			}
				);
	*/
//---------------------------------------------------------------------
/*3.
Stream<News> filtereddata=l.stream().filter(N->N.CommentedByUser=="some political person got arrested");
filtereddata.forEach
(
		News ->{
			System.out.println(News.CommentedByUser);
			}
				);
*/
	}

}
