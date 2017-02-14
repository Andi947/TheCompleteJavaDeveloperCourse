package com.andi947;

/**
 * Created by Andrea on 2017/02/07.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) { // int pagesPrinted
        if(tonerLevel > 0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else {
			this.tonerLevel = 0;
		}
        this.pagesPrinted = 0;   //-> usually only measured by printer thus shouldn't be a parameter
        this.isDuplex = isDuplex;
    }
	
	public int addToner(int tonerAmount){
		if(tonerAmount > 0 && tonerAmount <=100) {
			if(tonerAmount + this.tonerLevel > 100){
				return -1;
			} else {
				this.tonerLevel += tonerAmount;
				return this.tonerLevel;
			}
		} else {
			return -1;
		}
	}
	
	public int printPages(int pages){
		int pagesToPrint = pages;
		if(this.isDuplex) {
			pagesToPrint/=2;
			System.out.println("Printing in duplex mode");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}

    // NB - all field values should have the this.field keyword!!!!!
	public void fillToner(){   // fillToner is actually how much toner we added; thus this method isn't quite correct
        if(this.tonerLevel < 100 && this.tonerLevel >= 30){
            System.out.println("Toner at: " + this.tonerLevel + "%");
            this.tonerLevel = 100;
            System.out.println("Toner topped up: " + this.tonerLevel + "%");
        } else if (this.tonerLevel < 30 && this.tonerLevel >0){
            System.out.println("Toner level low: " + this.tonerLevel + "%");
            this.tonerLevel = 100;
            System.out.println("Toner refilled:" + this.tonerLevel + "%");
        } else {
            System.out.println("Toner finished: " + this.tonerLevel + "%");
            this.tonerLevel = 100;
            System.out.println("New toner: " + this.tonerLevel + "%");
        }
    }

    public int printPage(int pages){
	    if (this.isDuplex){
            if(pages%2 == 0){
                pages/= 2;
            } else {
                pages = (pages/2) + 1;
            }
            System.out.println("Printing in duplex mode: " + pages + " page/s");
        } else {
            System.out.println("Printing: " + pages + " page/s");

        }
        this.pagesPrinted += pages;
        System.out.println("Total number of pages printed: " + this.pagesPrinted + " page/s");
        this.tonerLevel -= pages;
        System.out.println("Toner level now: " + tonerLevel + "%");
        return pages;
    }


    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
