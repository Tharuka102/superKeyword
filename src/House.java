public class House {
    House (){
        System.out.println("Family in the House");
    }
}
class Room extends House{
    Room(){
        super();
        System.out.println("son in the room");
    }

    public static void main(String[] args) {
        Room r =new Room();
    }
}