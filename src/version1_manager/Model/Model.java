package version1_manager.Model;

public class   Model {
    int counter = 0;
    public void increase(){
        counter++;
    }
    public void reset(){
        counter = 0;
    }
    public int getCounter(){
        return counter;
    }
    public void setCounter(int input){
        this.counter = input;
    }
}

