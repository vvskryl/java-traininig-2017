package training;

/**
 * Created by Viacheslav Skryl on 16.11.2017
 */

public class Adapter {

	public static void main(String[] args) {
		//Inheritance
		IVectorGraphics g1 = new AdapterVectorFromRaster();
		g1.drawLine();
		g1.drawSquare(); 
		//Composition
		IVectorGraphics g2 = new AdapterVectorFromRaster();
		g2.drawLine();
		g2.drawSquare(); 
	}
}

interface IVectorGraphics {
	void drawLine();
	void drawSquare();
}

class RasterGraphics {
	void drawRasterLine() { System.out.println("Draw line"); }
	void drawRasterSquare() { System.out.println("Draw square"); }
}

class AdapterVectorFromRaster extends RasterGraphics implements IVectorGraphics {
	public void drawLine() {
		drawRasterLine();
	}
	public void drawSquare() {
		drawRasterSquare();
	}
}

class OtherAdapterVectorFromRaster implements IVectorGraphics {
	RasterGraphics rasterGraphics = new RasterGraphics();
	public void drawLine() {
		rasterGraphics.drawRasterLine();
	}
	public void drawSquare() {
		rasterGraphics.drawRasterSquare();
	}
}