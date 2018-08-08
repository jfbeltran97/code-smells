PROBLEMA:
class Auto{
    String tipo;
    
}
void printTipo(){
    Auto auto = new Auto("de lujo"); 
     switch(auto.getTipo()){
    case "jeep":
        System.out.print("Auto jeep");
        break;
    case "de lujo":
        System.out.print("Auto de lujo");
        break;
    default:
        System.out.print("Auto normal");
    }
}

REFACTOR:

class Auto{
    void printTipo(){
        System.out.print("Auto normal");
    }
}
class AutoDeLujo extends Auto{
    void printTipo(){
        System.out.print("Auto de lujo");
    }
}
class AutoJeep extends Auto{
    void printTipo(){
        System.out.print("Auto jeep");
    }
}

... Auto auto = new Auto();
    auto.printTipo(); ...