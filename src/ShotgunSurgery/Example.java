PROBLEMA:
class Project{
    Person[] participants;
    
}

class Person{
    int id;
    boolean participate(Project p){
        for(int i = 0; i < p.participants.length; i++){
            if(p.participants[i].id == id)
                return true;
        }
        return false;
    }
}
... if(x.participate(p)){
    ....
}

REFACTOR:
class Project{
    Person[] participants;
    boolean participate(Person p){
        for(int i = 0; i < participants.length; i++){
            if(participants[i].id == id)
                return true;
        }
        return false;
    }
}

class Person{
    int id;
}

... if(p.participate(x)){
    ...
}