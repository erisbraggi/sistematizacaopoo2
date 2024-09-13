package br.ceub.contacts;

public class ContactList {
	private Node head;

    public ContactList() {
        this.head = null;
    }

    public void addContact(Contact contact) {
        Node newNode = new Node(contact);
        if (head == null) {
            head = newNode;
            System.out.println("Contato adicionado com sucesso.");
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
        System.out.println("Contato adicionado com sucesso.");
    }


    public Contact searchContact(String nameOrPhone) {
        Node current = head;
        while (current != null) {
            Contact contact = current.getContact();
            if (contact.getName().equalsIgnoreCase(nameOrPhone) ||
                contact.getPhoneNumber().equals(nameOrPhone)) {
                return contact;
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean removeContact(String nameOrPhone) {
        if (head == null) {
            return false;
        }

        if (head.getContact().getName().equalsIgnoreCase(nameOrPhone) ||
            head.getContact().getPhoneNumber().equals(nameOrPhone)) {
            head = head.getNext();
            return true;
        }

        Node current = head;
        Node previous = null;

        while (current != null && 
               !(current.getContact().getName().equalsIgnoreCase(nameOrPhone) ||
                 current.getContact().getPhoneNumber().equals(nameOrPhone))) {
            previous = current;
            current = current.getNext();
        }

        if (current == null) {
            return false;
        }

        previous.setNext(current.getNext());
        return true;
    }

    public void listContacts() {
        if (head == null) {
            System.out.println("A lista de contatos está vazia.");
            return;
        }

        Node current = head;
        System.out.println("Lista de Contatos:");
        while (current != null) {
            System.out.println(current.getContact());
            current = current.getNext();
        }
    }
}
