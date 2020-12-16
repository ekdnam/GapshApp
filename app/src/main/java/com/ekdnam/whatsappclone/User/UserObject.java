package com.ekdnam.whatsappclone.User;

/**
 * Encapsulates information required to identify a unique user
 * A userID (uid), the user's name and phone number.
 */
public class UserObject {
    private String uid,
            name,
            phone;

    /**
     * @param uid
     * @param name
     * @param phone
     */
    public UserObject(String uid, String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
