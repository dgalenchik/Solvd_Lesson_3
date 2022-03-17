public class Main {
    public static void main(String[] args) {
        //создаём Instance классов

        AudioCard audioCard = new AudioCard("Beatbox", "TSMC");
        Cpu cpu = new Cpu("AMD", 2.222d);
        GraphicCard graphicCard = new GraphicCard("Nvidea", 2048, 1396);
        Memory memory = new Memory("Killsfire", 4096, "LLC");
        Client firstClient = new Client("Tom", "Vachovsky");
        Client secondClient = new Client("John", "Michailovich", "Koltyn");
        Macbook macbook = new Macbook("IBM", "JS412", "modern", "macbook",
                memory, graphicCard, audioCard, cpu,2200f,13.1f);
        Hp hp = new Hp("Hp","4530s","modern","laptop",
                memory,graphicCard,audioCard,cpu,4800f,15.3f);
        Lenovo lenovo = new Lenovo("Lenovo","k456","modern","laptop",
                memory,graphicCard,audioCard,cpu,6800f,14.3f);
        Letter letter = new Letter(macbook.computerInfo());
        //Отправляем изначальную конфигурацию
        macbook.send(letter, firstClient, secondClient);
        //изменяем конфигурацию Computer
        macbook.setManufacture("Macbook");
        macbook.setModel("KRT45967");
        cpu.setCpuManufacture("Intel");
        memory.setCapacity(1024);
        audioCard.setManufacture("Alien Heath");
        //Изменяем текст письма
        letter.setLetterText(macbook.computerInfo());
        //Отправляем обратное письмо с необходимыми комплектующими
        macbook.send(letter, secondClient, firstClient);
        System.out.println("---------------------");
        //Реализовываем методы Macbook
        System.out.println(macbook.toString());
        System.out.println("-------------");
        //Реализовываем методы Hp
        System.out.println(hp.toString());
        System.out.println("-------------");
        //Реализовываем методы Lenovo
        System.out.println(lenovo.toString());
    }
}
