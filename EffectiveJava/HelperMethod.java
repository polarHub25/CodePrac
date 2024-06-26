public class HelperMethod {
    public static void main(String[] args) {
        DocumentProcessor processor = new CustomDocumentProcessor();
        processor.processDocument();
    }
}
class DocumentProcessor {
    // Public method defining the workflow
    public final void processDocument() {
        openDocument();
        prepareContent();
        executePrint();  // 도우미 메서드 호출
        closeDocument();
    }

    // Private helper methods to protect important logic
    private void openDocument() {
        System.out.println("Opening document...");
    }

    private void closeDocument() {
        System.out.println("Closing document...");
    }

    // Protected method to be overridden by subclasses
    protected void prepareContent() {
        System.out.println("Preparing content in superclass...");
    }

    // Private helper method calling the potentially overridden method
    private void executePrint() {
        printContent();  // 하위 클래스에서 재정의될 수 있는 메서드 호출
    }

    // Method to be overridden by subclasses
    protected void printContent() {
        System.out.println("Printing content in superclass...");
    }
}

class CustomDocumentProcessor extends DocumentProcessor {
    @Override
    protected void prepareContent() {
        System.out.println("Preparing custom content...");
    }

    @Override
    protected void printContent() {
        System.out.println("Printing custom content...");
    }
}