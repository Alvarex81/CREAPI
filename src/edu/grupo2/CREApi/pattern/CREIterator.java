package edu.grupo2.CREApi.pattern;

public class CREIterator implements Iterator {

    private CRE cre;
    private int position;

    public CREIterator(CRE cre) {
        this.cre = cre;
        this.position = 0;
    }

    @Override
    public boolean isDone() {
        return this.position >= this.cre.getCRE().size();
    }

    @Override
    public String currentItem() {
        return this.cre.getCRE().get(this.position++).toString();
    }

}
