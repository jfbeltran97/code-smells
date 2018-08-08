PROBLEMA:
void sendEmail(String email){
    
    if(email.matches["[a-z0-9]+@[a-z\\.]+[a-z]"]){ //validates email
        ...send email...
    }
}


REFACTOR:
void sendEmail(String email){
    
    if(isValidEmail(email)){
        ...send email...
    }
}

boolean isValidEmail(String email){
    return email.matches("[a-z0-9]+@[a-z\\.]+[a-z]");
}