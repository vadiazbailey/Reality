package Criterios;

import java.util.Comparator;

import Reality.*;

public class CriterioCompuesto implements Comparator<Banda>{

	private Comparator<Banda> c1;
	private Comparator<Banda> c2;
	
	public CriterioCompuesto(Comparator<Banda> c1, Comparator<Banda> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
    public int compare(Banda participante1, Banda participante2) {
        int res = c1.compare(participante1,participante2);
        if (res == 0 && c2!=null)
            return c2.compare(participante1,participante2);
        return res;
    }
}
