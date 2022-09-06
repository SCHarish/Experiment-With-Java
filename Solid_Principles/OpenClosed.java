public class OpenClosed{
    public static void main(String args[]){

    }
}


abstract class Shape_OpenClosed{ // This class violates open closed principle. This class is not closed for modification
    int findArea(Shape_OpenClosed[] shapes){
        for(Shape_OpenClosed s : shapes){
            if(s instanceof Rectangle_OpenClosed){

            } else if(s instanceof Square_OpenClosed){

            }
        }
        return 1;
    }
}

class Rectangle_OpenClosed extends Shape_OpenClosed{

}


class Square_OpenClosed extends Shape_OpenClosed{
    
}


/**
 * To rectify the problem
 
 abstract class Shape_OpenClosed{ 
    abstract int findArea();
 }

class Rectangle_OpenClosed extends Shape_OpenClosed{
    Rectangle_OpenClosed(){

    }

    int findArea(){

    }
}


class Square_OpenClosed extends Shape_OpenClosed{

    Square_OpenClosed(){

    }

    int findArea(){
        return 
    }
}

class Triangle_OpenClosed extends Shape_OpenClosed{ //It can be extended

    Square_OpenClosed(){

    }

    int findArea(){
        return 
    }
}

class ClientApp{
    public static void main(String args[]){
        Shapes[] shapes;

        for(Shape s: shapes){
            int area = s.findArea();
        }
    }
}
 * 
 * 
 * 
 */