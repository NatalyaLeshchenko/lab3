import org.w3c.dom.ls.LSOutput;

public class Freken_Bok extends Human implements Appearable, Cookable, Startable, Flinchable, Listenable,Standable, Tellable, Worryable {
    public Freken_Bok(String name) {
        super(name);
    }


    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.hashCode() != obj.hashCode()) return false;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        if (this.name == ((Human) obj).name) return true;
        else return false;

    }

    @Override
    public String toString() {
        return "Имя: " + get_name();
    }

    @Override
    public void appear(String where) {
        System.out.println("И в самом деле, "+ where+" появилась " + get_name() + ".");
    }

    public void flinch(){
        System.out.println(get_name()+ " вздрогнула.");
    }

    public void listen(String who, String what) {
        System.out.println("Казалось, " + who + "услышала "+ what);
    }

    public void worry(String how, String why){
        System.out.print("А может, " + get_name()+ how + " волновалась, "+ why);
    }
    public void stand(String where){
        System.out.print(" стояла "+ where);
    }
    public void tell(String about){
        System.out.print(" и должна была поведать, "+ about);
    }
    public void start(String what){
        System.out.println(" приготовить "+ what);}

    public void cook(Ingredients ingredients) {
        System.out.print(" из ");

        switch (ingredients) {
          case tomato_paste:
              System.out.print("томатной пасты,");break;
          case onions:
              System.out.print("лука,");break;
          case salt:
              System.out.print("соли,");break;
              case garlic:
                System.out.print( "чеснока,");break;
          case pepper:
              System.out.print("перца.");break;

      }
    }


    }

