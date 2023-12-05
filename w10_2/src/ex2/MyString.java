package ex2;

import java.text.Collator;

class MyString implements Comparable<MyString> {
    private String value;

    public MyString(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int compareTo(MyString o) {
        Collator collator = Collator.getInstance();
        return collator.compare(this.value, o.value);
    }
}
