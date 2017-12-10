package ����;

import ����.AppIO;

public class Menu {

   private int _size;

   // Ŀ��,����,���̵�,����
   private Product[] _coffeeMenu;// �Ƹ޸�ī�� ��
   private Product[] _drinkMenu;
   private Product[] _sideMenu;
   private Product[] _seasonMenu;

   public int getSize() {
      return _size;
   }

   private void setSize(int size) {
      this._size = size;
   }

   public Product[] coffeeMenu() {
      return this._coffeeMenu;
   }

   private void setCoffeeMenu(Product[] aMenu) {
      this._coffeeMenu = aMenu;
   }

   public Product[] drinkMenu() {
      return this._drinkMenu;
   }

   private void setDrinkMenu(Product[] aMenu) {
      this._drinkMenu = aMenu;
   }

   public Product[] sideMenu() {
      return this._sideMenu;
   }

   private void setSideMenu(Product[] aMenu) {
      this._sideMenu = aMenu;
   }

   public Product[] seasonMenu() {
      return this._seasonMenu;
   }

   private void setSeasonMenu(Product[] aMenu) {
      this._seasonMenu = aMenu;
   }

   public Menu() {

      this.setSize(0);
      this.setCoffeeMenu(new Product[15]);
      this.setDrinkMenu(new Product[15]);
      this.setSideMenu(new Product[15]);
      this.setSeasonMenu(new Product[15]);

      //this.fixedAllMenu();

   }

   public void MenuBoard() {   // �޴��� ��� �޼ҵ�
      int c, d, s;
      AppIO.outputLine("\n[PONKU] �޴����� ����մϴ�.");
      AppIO.outputLine(
            "\n      <<   Coffee   >>                <<   Drink   >>                  <<   Side   >>                 <<   Season   >>");
      AppIO.outputLine(
            "          �̸�                         ����                         �̸�                           ����                          �̸�                          ����                          �̸�                          ����");
      for (int i = 0; i < this.seasonMenu().length - 1 && this._seasonMenu[i] != null; i++) {
         AppIO.outputLine(String.format("%10s   %8s", this.coffeeMenu()[i].name(), this.coffeeMenu()[i].cost())
               + String.format("   %10s   %8s", this.drinkMenu()[i].name(), this.drinkMenu()[i].cost())
               + String.format("   %10s   %8s", this.sideMenu()[i].name(), this.sideMenu()[i].cost())
               + String.format("   %10s   %8s", this.seasonMenu()[i].name(), this.seasonMenu()[i].cost()));
      }
      for (s = 0; this._seasonMenu[s] != null; s++) {
      }

      for (int i = s; i < this.sideMenu().length - 1 && this._sideMenu[i] != null; i++) {
         AppIO.outputLine(String.format("%10s   %8s", this.coffeeMenu()[i].name(), this.coffeeMenu()[i].cost())
               + String.format("   %10s   %8s", this.drinkMenu()[i].name(), this.drinkMenu()[i].cost())
               + String.format("   %10s   %8s", this.sideMenu()[i].name(), this.sideMenu()[i].cost()));
      }
      for (d = 0; this._sideMenu[d] != null; d++) {
      }

      for (int i = d; i < this.drinkMenu().length - 1 && this._drinkMenu[i] != null; i++) {
         AppIO.outputLine(String.format("%10s   %8s", this.coffeeMenu()[i].name(), this.coffeeMenu()[i].cost())
               + String.format("   %10s   %8s", this.drinkMenu()[i].name(), this.drinkMenu()[i].cost()));
      }
      for (c = 0; this._drinkMenu[c] != null; c++) {
      }

      for (int i = c; i < this.coffeeMenu().length - 1 && this._coffeeMenu[i] != null; i++) {
         AppIO.outputLine(String.format("%10s   %8s", this.coffeeMenu()[i].name(), this.coffeeMenu()[i].cost()));
      }
      AppIO.outputLine("");
   }

   public void fixedCoffeeMenu() {

      Product Espresso = new Product("����������", 1500, "Coffee");

      Product HotAmericano = new Product("�Ƹ޸�ī��(H)", 2000, "Coffee");
      Product IcedAmericano = new Product("�Ƹ޸�ī��(C)", 2000, "Coffee");

      Product HotCaffeLatte = new Product("ī���(H)", 3500, "Coffee");
      Product IcedCaffeLatte = new Product("ī���(C)", 3500, "Coffee");

      Product HotVanillaLatte = new Product("�ٴҶ��(H)", 3500, "Coffee");
      Product IcedVanillaLatte = new Product("�ٴҶ��(C)", 3500, "Coffee");

      Product HotCaramelMacchiato = new Product("ī��Ḷ���ƶ�(H)", 3500, "Coffee");
      Product IcedCaramelMacchiato = new Product("ī��Ḷ���ƶ�(C)", 3500, "Coffee");

      Product HotWhiteCaffeMocha = new Product("ȭ��Ʈī���ī(H)", 4000, "Coffee");
      Product IcedWhiteCaffeMocha = new Product("ȭ��Ʈī���ī(C)", 4000, "Coffee");

      Product Cappuccino = new Product("īǪġ��", 3500, "Coffee");

      this.coffeeMenu()[0] = Espresso;
      this.coffeeMenu()[1] = HotAmericano;
      this.coffeeMenu()[2] = IcedAmericano;
      this.coffeeMenu()[3] = HotCaffeLatte;
      this.coffeeMenu()[4] = IcedCaffeLatte;
      this.coffeeMenu()[5] = HotVanillaLatte;
      this.coffeeMenu()[6] = IcedVanillaLatte;
      this.coffeeMenu()[7] = HotCaramelMacchiato;
      this.coffeeMenu()[8] = IcedCaramelMacchiato;
      this.coffeeMenu()[9] = HotWhiteCaffeMocha;
      this.coffeeMenu()[10] = IcedWhiteCaffeMocha;
      this.coffeeMenu()[11] = Cappuccino;

   }

   public void fixedDrinkMenu() {

      Product OmijaAde = new Product("�����ڿ��̵�", 3500, "Ade");
      Product OrangeAde = new Product("���������̵�", 3500, "Ade");
      Product HanrabongAde = new Product("�Ѷ�����̵�", 3800, "Ade");
      Product PinkBerry = new Product("��ũ������������", 3800, "Ade");
      Product Lime = new Product("�����������", 3800, "Ade");
      Product BlackTeaLemonade = new Product("��Ƽ������̵�", 3800, "Ade");
      // Product CitronAndGrapefruit = new Product("���� �ڸ� ���̵�", 3800, "Ade");

      Product StrawberryYogurt = new Product("������Ʈ������", 4000, "Smoothie");
      Product ChocolateBanana = new Product("���ݸ��ٳ���������", 4000, "Smoothie");
      Product MangoFruit = new Product("�����ĸ���������", 4300, "Smoothie");
      Product PeachYogurt = new Product("��ġ���Ʈ������", 4300, "Smoothie");
      Product BlueBerry = new Product("��纣��������", 4300, "Smoothie");
      // Product AppleKiwi = new Product("����Ű�� ������", 4300, "Smoothie");

      this.drinkMenu()[0] = OmijaAde;
      this.drinkMenu()[1] = OrangeAde;
      this.drinkMenu()[2] = HanrabongAde;
      this.drinkMenu()[3] = PinkBerry;
      this.drinkMenu()[4] = Lime;
      this.drinkMenu()[5] = BlackTeaLemonade;
      // this.drinkMenu()[6] = CitronAndGrapefruit;

      this.drinkMenu()[6] = StrawberryYogurt;
      this.drinkMenu()[7] = ChocolateBanana;
      this.drinkMenu()[8] = MangoFruit;
      this.drinkMenu()[9] = PeachYogurt;
      this.drinkMenu()[10] = BlueBerry;
      // this.drinkMenu()[12] = AppleKiwi;

   }

   public void fixedSideMenu() {

      Product PeachCake = new Product("����������ũ", 4500, "Cake");
      Product CreamCheeseCake = new Product("ũ��ġ������ũ", 5000, "Cake");
      Product TiramisuCake = new Product("Ƽ��̽�", 4000, "Cake");

      Product InkCheeseMini = new Product("�Թ�ġ��̴ϽĻ�", 5000, "Bread");
      Product GarlicPie = new Product("��������", 4000, "Bread");
      Product CaramelChiffon = new Product("ī��Ὤ��", 5000, "Bread");

      Product SpicyChicken = new Product("ġŲ������ġ", 5500, "Sandwich");
      Product YoungLeaf = new Product("���ä�һ�����ġ", 5000, "Sandwich");

      Product Milk = new Product("��ũ���̽�ũ��", 2000, "Icecream");

      this.sideMenu()[0] = PeachCake;
      this.sideMenu()[1] = CreamCheeseCake;
      this.sideMenu()[2] = TiramisuCake;

      this.sideMenu()[3] = InkCheeseMini;
      this.sideMenu()[4] = GarlicPie;
      this.sideMenu()[5] = CaramelChiffon;

      this.sideMenu()[6] = SpicyChicken;
      this.sideMenu()[7] = YoungLeaf;

      this.sideMenu()[8] = Milk;

   }

   public void fixedSeasonMenu() {

      Product DutchCoffeeIce = new Product("��ġĿ�Ǻ���", 9800, "Season");
      Product MangoIce = new Product("�������", 10800, "Season");
      Product BerryIce = new Product("��������", 10800, "Season");

      this.seasonMenu()[0] = DutchCoffeeIce;
      this.seasonMenu()[1] = MangoIce;
      this.seasonMenu()[2] = BerryIce;

   }

   public void fixedAllMenu() {
      this.fixedCoffeeMenu();
      this.fixedDrinkMenu();
      this.fixedSideMenu();
      this.fixedSeasonMenu();
   }

   public void addMenu(Product aProduct) {

      Product addProduct = new Product();

      if (aProduct != null) {
         addProduct = aProduct;

         switch (addProduct.type()) {

         case "Coffee":
            int coffeeSize = 0;

            for (int i = 0; i < this.coffeeMenu().length - 1; i++) {
               if (this.coffeeMenu()[i] == null) {
                  coffeeSize = i;
                  this.coffeeMenu()[coffeeSize] = addProduct;
                  break;
               }
            }

         case "Drink":
            int drinkSize = 0;

            for (int i = 0; i < this.drinkMenu().length - 1; i++) {
               if (this.drinkMenu()[i] == null) {
                  drinkSize = i;
                  this.drinkMenu()[drinkSize] = addProduct;
                  break;
               }
            }

         case "Side":
            int sideSize = 0;

            for (int i = 0; i < this.sideMenu().length - 1; i++) {
               if (this.sideMenu()[i] == null) {
                  sideSize = i;
                  this.sideMenu()[sideSize] = addProduct;
                  break;
               }
            }

         case "Season":
            int seasonSize = 0;

            for (int i = 0; i < this.seasonMenu().length - 1; i++) {
               if (this.seasonMenu()[i] == null) {
                  seasonSize = i;
                  this.seasonMenu()[seasonSize] = addProduct;
                  break;
               }
            }

         default:
            AppIO.outputLine("type�� ����");
            break;
         }
      }
   }

   public Product findMenu(String aName, String aType) {

      String findType = aType;
      String findName = aName;

      switch (findType) {
      case "Coffee":

         for (int i = 0; i < this.coffeeMenu().length - 1; i++) {
            if (this.coffeeMenu()[i].name() == findName) {
               return this.coffeeMenu()[i];
            } else {
               AppIO.outputLine("ã�����ϴ� �޴��� Coffee�� �������� �ʽ��ϴ�.");
            }
         }
         break;

      case "Drink":

         for (int i = 0; i < this.drinkMenu().length - 1; i++) {
            if (this.drinkMenu()[i].name() == findName) {
               return this.drinkMenu()[i];
            } else {
               AppIO.outputLine("ã�����ϴ� �޴��� Ade�� �������� �ʽ��ϴ�.");
            }
         }
         break;

      case "Side":

         for (int i = 0; i < this.sideMenu().length - 1; i++) {
            if (this.sideMenu()[i].name() == findName) {
               return this.sideMenu()[i];
            } else {
               AppIO.outputLine("ã�����ϴ� �޴��� Smoothie�� �������� �ʽ��ϴ�");
            }
         }
         break;

      case "Season":

         for (int i = 0; i < this.seasonMenu().length - 1; i++) {
            if (this.seasonMenu()[i].name() == findName) {
               return this.seasonMenu()[i];
            } else {
               AppIO.outputLine("ã�����ϴ� �޴��� Season�� �������� �ʽ��ϴ�.");
            }
         }
         break;

      default:
         AppIO.outputLine("ã���� �ϴ� �޴� Ÿ���� �������� �ʽ��ϴ�.");
         break;
      }
      return null;
   }

   public void removeMenu(String aName, String aType) {

      String findType = aType;
      String findName = aName;

      switch (findType) {
      case "Coffee":

         for (int i = 0; i < this.coffeeMenu().length - 1; i++) {
            if (this.coffeeMenu()[i].name() == findName) {

               this.coffeeMenu()[i] = null;

               for (int j = i + 1; j < this.coffeeMenu().length - 1; j++) {
                  this.coffeeMenu()[i] = this.coffeeMenu()[j];
                  i++;
               }

            } else {
               AppIO.outputLine("ã�����ϴ� �޴��� Coffee�� �������� �ʽ��ϴ�.");
            }
         }
         break;

      case "Drink":

         for (int i = 0; i < this.drinkMenu().length - 1; i++) {
            if (this.drinkMenu()[i].name() == findName) {

               this.drinkMenu()[i] = null;

               for (int j = i + 1; j < this.drinkMenu().length - 1; j++) {
                  this.drinkMenu()[i] = this.drinkMenu()[j];
                  i++;
               }
            } else {
               AppIO.outputLine("ã�����ϴ� �޴��� Ade�� �������� �ʽ��ϴ�.");
            }
         }
         break;

      case "Side":

         for (int i = 0; i < this.sideMenu().length - 1; i++) {
            if (this.sideMenu()[i].name() == findName) {
               this.sideMenu()[i] = null;

               for (int j = i + 1; j < this.sideMenu().length - 1; j++) {
                  this.sideMenu()[i] = this.sideMenu()[j];
                  i++;
               }
            } else {
               AppIO.outputLine("ã�����ϴ� �޴��� Smoothie�� �������� �ʽ��ϴ�");
            }
         }
         break;

      case "Season":

         for (int i = 0; i < this.seasonMenu().length - 1; i++) {
            if (this.seasonMenu()[i].name() == findName) {
               this.seasonMenu()[i] = null;

               for (int j = i + 1; j < this.seasonMenu().length - 1; j++) {
                  this.seasonMenu()[i] = this.seasonMenu()[j];
                  i++;
               }
            } else {
               AppIO.outputLine("ã�����ϴ� �޴��� Season�� �������� �ʽ��ϴ�.");
            }
         }
         break;

      default:
         AppIO.outputLine("ã���� �ϴ� �޴� Ÿ���� �������� �ʽ��ϴ�.");
         break;
      }
   }
}