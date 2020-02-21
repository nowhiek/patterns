public class SiteDescrBean {
    private long id;
    private String name;
    private String theURL;

    private String description;
    private int category;

    private Memento undo;

    private class Memento {
        String siteDescription;
        int siteCategory;

        Memento() {
            siteDescription = description;
            siteCategory = category;
        }

        String getDescr() {
            return siteDescription;
        }

        int getCateg() {
            return siteCategory;
        }
    }

    public void preview() {
        // ...
        undo = new Memento();
        // ...
    }

    public void undoChanges() {
        description = undo.getDescr();
        category = undo.getCateg();
        // ...
    }
}

class Application {
    ...
    public void method() {
        ...
        siteDescrBean.preview();
        siteDescrBean.setDescription(someDescription);
        siteDescrBean.setCategory(someCategoryId);
        ...
        siteDescrBean.undoChanges();
    }
}
