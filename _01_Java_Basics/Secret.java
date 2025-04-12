//input - cuvantDecupat, cuvantDeCreat
//output - sa verific daca pot forma cuvantul avand la dispozitie literele din cuvantul decupat

public class Secret{
public boolean sePoateFormaCuvantul(String cuvantDecupat, String cuvantDeCreat){
Map<Character, Integer> litereCuvantDecupat = new HashMap<>();
Map<Character, Integer> litereCuvantDeCreat = new HashMap<>();

if(cuvantDecupat == null || cuvantDeCreat == null) {
return false;
}

if(cuvantDecupat.length() != cuvantDeCreat.length()) {
return false;
}

for(char c: litereCuvantDecupat.toCharArray()){
    litereCuvantDecupat.put(c, litereCuvantDecupat.getOrDefault(c, 0) + 1);
}

for(char c: litereCuvantDeCreat.toCharArray()){
    litereCuvantDeCreat.put(c, litereCuvantDeCreat.getOrDefault(c, 0) + 1);
}

for(char c: litereCuvantDeCreat.keySet()){
    if(!litereCuvantDecupat.containsKey(c) || litereCuvantDecupat.get(c) != litereCuvantDeCreat.get(c)){
        return false;
    }
}

return true;

}
public static void main(String[] args) {
    Secret secret = new Secret();
    String cuvantDecupat = "abcde";
    String cuvantDeCreat = "edcba";
    System.out.println(secret.sePoateFormaCuvantul(cuvantDecupat, cuvantDeCreat)); // Output: true
}
