
package javaapplication1;


public class JavaApplication1 {


    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Oscar");
        System.out.println(p.getNome());
        
        Produto p1 = new Produto();
        p1.setNome("playstation 5 ");
        p1.setPreco(3200);
        p1.setDescricao("videogame de alto nivel de gameplay e qualidade");
        System.out.println(p1.getNome()+"\n" + p1.getDescricao()+"\n"+ p1.getPreco());
        
        Circulo c = new Circulo();
        c.setRaio(50);
        c.setCor("vermelho");
        System.out.println(c.getCor()+"\n"+ c.getRaio());
        
        Estudante e = new Estudante("Gabriel", 15, "47874544541", "rua antonelio silva");
        e.getNome();
        e.getIdade();
        e.getCpf();
        e.getEndereco();
        System.out.println(e.getNome()+"\n"+ e.getIdade()+"\n"+ e.getCpf()+"\n"+ e.getEndereco());
        
    
    }
   
    
}
