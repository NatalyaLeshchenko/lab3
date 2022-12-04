public abstract class Human {
    protected String name;
    public Human(String name) {
        this.name=name;
    }

    public String get_name () {
        return name;
    }
public void appear( String where){
    System.out.println();
}

@Override
    public int hashCode()  {
        int result = name==null ? 0:name.hashCode();
        return result;
}

@Override
    public boolean equals (Object obj) {
    if (this == obj) return true;
    if (this.hashCode() != obj.hashCode()) return false;
    if (obj == null || this.getClass() != obj.getClass()) return false;
    if (this.name== ((Human) obj).name) return true ; else return  false;

}

@Override
public String toString() {
    return "Имя: " + get_name();
}
}