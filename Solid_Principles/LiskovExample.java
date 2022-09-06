public class LiskovExample{
    public static void main(String args[]){

    }


    static void findArea(Rectangle_LiskovExample shape){ //We cannot replace Rectangle_LiskovExample with Square
        shape.setHeight(5);
        shape.setWidth(7);
        shape.findArea(); //Area result will differ if we substitute 
    }
}

class Rectangle_LiskovExample{
    private int height, width;
    void setHeight(int height){
        this.height = height;
    }

    void setWidth(int width){
        this.width = width;
    }

    int findArea(){
        return width * height;
    }
}

class Square_LiskovExample extends Rectangle_LiskovExample{
    private int height, width;

    void setHeight(int height){
        this.height = height;
        this.width = height;
    }

    void setWidth(int width){
        this.width = width;
        this.height = width;
    }

    int findArea(){
        return width * height;
    }
}