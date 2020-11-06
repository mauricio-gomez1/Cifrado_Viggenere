package viggenere;

public class DecifradoVigenere {
    //una tabla de el abc
    char tablaCesar[]={'A', 'B', 'C', 'D', 'E', 'F',
                        'G', 'H', 'I', 'J', 'K', 'L', 
                        'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R',
                        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    
    public char getTextoDescifrado(char TextoCifrado, char TextoClave){
        
        //indices para encontrar los elementoss
        
        int indiceCharTextoCifrado = 0;
        int indiceCharTextoClave = 0;
        boolean simo=false;
        
        for(int i = 0; i < tablaCesar.length; i++){
            if(TextoCifrado == tablaCesar[i]){
                indiceCharTextoCifrado = i;
                simo=true;
                break;
            }
        }
        
        for(int j = 0; j<tablaCesar.length; j++){
            if(TextoClave == tablaCesar[j]){
                indiceCharTextoClave = j;
                break;
            }
        }
        int sim;
        if(simo){
            if(indiceCharTextoCifrado >= indiceCharTextoClave){
                sim=(indiceCharTextoCifrado - indiceCharTextoClave)%27;
                return tablaCesar[sim];
            }else{
                sim=27-(indiceCharTextoClave - indiceCharTextoCifrado);
                return tablaCesar[sim];
            
            }
        }else{
            return TextoCifrado;
        }
    }
}
