package Lab6;
import java.util.Scanner;
public class Exhibition {
    public static Scanner in=new Scanner(System.in);
    public info info;
    public String exhibition;
    public Exhibition(){
        System.out.println("Введите название выставки");
        setExhibition(in.nextLine());
        info=new info();
    }
    public String getExhibition(){
        return exhibition;
    }
    public void setExhibition(String exhibition){
        this.exhibition=exhibition;
    }
    public class info{
        String painting,author,time;
        public info(){
            System.out.println("Картины, учавствующие в выставке:");
            setPainting(in.nextLine());
            System.out.println("Авторы работ, участвующих в выставке:");
            setAuthor(in.nextLine());
            System.out.println("Время проведения выставки:");
            setTime(in.nextLine());
        }

        public void setPainting(String painting) {
            this.painting = painting;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getPainting() {
            return painting;
        }

        public String getAuthor() {
            return author;
        }

        public String getTime() {
            return time;
        }

        public void print(){
            System.out.println("В выставке " +'"'+getExhibition()+'"' + " которая будет открыта "+getTime()+" будут показаны работы автора(ов): "+getAuthor()+", среди которых будут представлен(ы) :"+getPainting());
        }
    }
}
