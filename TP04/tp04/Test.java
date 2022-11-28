package tp04;


public class Test extends tela implements windowListener {

    static void main (String []args){

      tela form = new tela("TRABALHO PRATICO 04", 600, 500, 50, 50);
       form.add(l1);
       form.add(t1);
       form.add(b1);
       form.add(l2);
       form.add(t2);
       form.add(l3);
       form.add(t3);
       form.add(l1);
       form.add(b2);
       form.add(b3);
      form.setVisible(true);
    }
    
}
