package com.matrix.example.demo.model;

import com.matrix.example.demo.enums.IceCreamCategory;

public class GallaryDto {
    private IceCreamCategory icecreamType;
    private String icecreamImage;

    public GallaryDto() {
    }

    public GallaryDto(IceCreamCategory icecreamType, String icecreamImage) {
        this.icecreamType = icecreamType;
        this.icecreamImage = icecreamImage;
    }

    public IceCreamCategory getIcecreamType() {
        return icecreamType;
    }

    public void setIcecreamType(IceCreamCategory icecreamType) {
        this.icecreamType = icecreamType;
    }

    public String getIcecreamImage() {
        return icecreamImage;
    }

    public void setIcecreamImage(String icecreamImage) {
        this.icecreamImage = icecreamImage;
    }

    @Override
    public String toString() {
        return "GallaryDto{" +
                "icecreamType=" + icecreamType +
                ", icecreamImage='" + icecreamImage + '\'' +
                '}';
    }
}