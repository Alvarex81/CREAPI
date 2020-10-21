package edu.grupo2.CREApi.pattern;

public class InverseCREIterator implements Iterator {

    private CRE cre;
    private int position;

    public InverseCREIterator(CRE cre) {
        this.cre = cre;
        this.position = this.cre.getCRE().size() - 1;
    }

    @Override
    public boolean isDone() {
        return this.position < 0;
    }

    @Override
    public String currentItem() {
        return this.cre.getCRE().get(this.position--).toString();
    }

}
