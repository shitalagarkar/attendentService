package com.attendentinfo.attendentService;

public class Photo {
    private String photo_id;
    private String fileName ;
    private byte[] photo;

    public Photo(String photo_id, String fileName, byte[] photo) {
        this.photo_id = photo_id;
        this.fileName = fileName;
        this.photo = photo;
    }

    public Photo() {

    }

    public String getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(String photo_id) {
        this.photo_id = photo_id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
