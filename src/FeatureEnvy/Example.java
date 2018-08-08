PROBLEMA:
class A{
    byte featureA1;
    byte featureA2;
    
    void featureA3(){
        
    }
    
    void envyMethod(){
        ...featureB1...
            ...featureB2...
            
    }
}

class B{
    int featureB1;
    int featureB2;
    
    void featureB3(){
        
    }
}


REFACTOR:
class A{
    byte featureA1;
    byte featureA2;
    
    void featureA3(){
        
    }
    
}

class B{
    int featureB1;
    int featureB2;
    
    void featureB3(){
        
    }
    
    void envyMethod(){
        ...featureB1...
            ...featureB2...
            
    }
}