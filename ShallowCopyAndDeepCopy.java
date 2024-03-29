public class ShallowCopyAndDeepCopy {
    public static void main(String args[]){
        ShallowCopyAndDeepCopy obj = new ShallowCopyAndDeepCopy();

        SampleExample testObj = obj.new SampleExample(1, "sdf");
        System.out.println("Inside main method "+testObj.hashCode());
        SampleExample copyObj = testObj.clone();
        System.out.println("Inside main method "+copyObj.hashCode());
    }

    //ShallCopy Example
    class SampleExample implements Cloneable{
        int id;
        String name;

        SampleExample(int id, String name){
            this.id = id;
            this.name = name;
            System.out.println("Inside constructor hashcode "+this.hashCode());
        }

        SampleExample(SampleExample originalObject){ //copy constructor
            this(originalObject.id, originalObject.name);
        }

        @Override
        public SampleExample clone(){
            try{
                return (SampleExample) super.clone();
            } catch(CloneNotSupportedException ex){

            }
            return null;
        }
    }

    class DeepCopy implements Cloneable{
        SampleExample obj;
        String name;

        @Override
        public DeepCopy clone()throws CloneNotSupportedException{
            DeepCopy copyObj = super.clone();
            copyObj.obj = this.obj.clone();
            return copyObj;
        }
    }
}
