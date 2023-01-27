package Model;

class Category extends Model.Main_Category {
    private String categoryName;

    public Category(String mainCategoryName, String CategoryName) {
        super(mainCategoryName);
        this.categoryName = CategoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}