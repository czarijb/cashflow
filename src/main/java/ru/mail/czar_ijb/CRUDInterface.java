package ru.mail.czar_ijb;

/**
 * Не факт что я правильно поступил, но почему то мне показалось,
 * что надо впихать методы создания удаления и обновления всех категорий в интерфейс
 */
public interface CRUDInterface {

    public void createCategory(String name, int ... param);

    public void updateCategory(String name, int ... param);

    public void deleteCategory(String name, int ... param);
}
