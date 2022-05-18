public interface HeavenlyBody {String describe(); }

class Star implements HeavenlyBody {String starName;
     public String describe() {return "star " + starName; }
}
class Planet;

String name;

Star orbiting;
public String describe() { return "planet" + name + " orbiting" + orbiting.describe();
}
}
// public class test {
//   public static void main(String[] args) {
//       try{
//           System.out.println("k");
//       }
//       finally{
//           System.out.println("l");
//       }
//   }  
// }
