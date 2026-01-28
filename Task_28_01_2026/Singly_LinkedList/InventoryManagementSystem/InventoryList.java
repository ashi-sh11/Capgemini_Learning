package Task_28_01_2026.Singly_LinkedList.InventoryManagementSystem;

class InventoryList {
    private ItemNode head;

    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode newNode = new ItemNode(id, name, qty, price);
        ItemNode temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void removeById(int id) {
        if (head == null) {
            System.out.println("Inventory empty");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;

        if (temp.next == null)
            System.out.println("Item not found");
        else {
            temp.next = temp.next.next;
            System.out.println("Item removed");
        }
    }
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Item not found");
    }
    public void searchById(int id) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Item not found");
    }

    public void searchByName(String name) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Item not found");
    }
    public void displayInventory() {
        ItemNode temp = head;

        if (temp == null) {
            System.out.println("Inventory empty");
            return;
        }

        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(ItemNode item) {
        System.out.println(
                item.itemId + " | " +
                        item.itemName + " | Qty: " +
                        item.quantity + " | Price: " +
                        item.price
        );
    }
    public void totalInventoryValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = " + total);
    }
    public void sortByName(boolean ascending) {
        head = mergeSort(head, ascending, true);
    }
    private ItemNode mergeSort(ItemNode node, boolean asc, boolean byName) {
        if (node == null || node.next == null)
            return node;

        ItemNode mid = getMiddle(node);
        ItemNode nextOfMid = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(node, asc, byName);
        ItemNode right = mergeSort(nextOfMid, asc, byName);

        return merge(left, right, asc, byName);
    }
    private ItemNode merge(ItemNode a, ItemNode b, boolean asc, boolean byName) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (byName)
            condition = asc ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                    : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        else
            condition = asc ? a.price <= b.price : a.price > b.price;

        if (condition) {
            a.next = merge(a.next, b, asc, byName);
            return a;
        } else {
            b.next = merge(a, b.next, asc, byName);
            return b;
        }
    }
    private ItemNode getMiddle(ItemNode node) {
        if (node == null) return node;

        ItemNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}

