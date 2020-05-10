package xyz.zedler.patrick.grocy.model;

/*
    This file is part of Grocy Android.

    Grocy Android is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Grocy Android is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Grocy Android.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2020 by Patrick Zedler & Dominic Zedler
*/

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class ProductDetails implements Parcelable {

    @SerializedName("product")
    private Product product;

    @SerializedName("last_purchased")
    private String lastPurchased;

    @SerializedName("last_used")
    private String lastUsed;

    @SerializedName("stock_amount")
    private double stockAmount;

    @SerializedName("stock_amount_opened")
    private double stockAmountOpened;

    @SerializedName("stock_amount_aggregated")
    private double stockAmountAggregated;

    @SerializedName("stock_amount_opened_aggregated")
    private double stockAmountOpenedAggregated;

    @SerializedName("quantity_unit_purchase")
    private QuantityUnit quantityUnitPurchase;

    @SerializedName("quantity_unit_stock")
    private QuantityUnit quantityUnitStock;

    @SerializedName("last_price")
    private String lastPrice;

    @SerializedName("next_best_before_date")
    private String nextBestBeforeDate;

    @SerializedName("location")
    private Location location;

    @SerializedName("average_shelf_life_days")
    private int averageShelfLifeDays;

    @SerializedName("spoil_rate_percent")
    private double spoilRatePercent;

    @SerializedName("is_aggregated_amount")
    private int isAggregatedAmount;

    public ProductDetails(Parcel parcel) {
        product = parcel.readParcelable(Product.class.getClassLoader());
        lastPurchased = parcel.readString();
        lastUsed = parcel.readString();
        stockAmount = parcel.readDouble();
        stockAmountOpened = parcel.readDouble();
        stockAmountAggregated = parcel.readDouble();
        stockAmountOpenedAggregated = parcel.readDouble();
        quantityUnitPurchase = parcel.readParcelable(QuantityUnit.class.getClassLoader());
        quantityUnitStock = parcel.readParcelable(QuantityUnit.class.getClassLoader());
        lastPrice = parcel.readString();
        nextBestBeforeDate = parcel.readString();
        location = parcel.readParcelable(Location.class.getClassLoader());
        averageShelfLifeDays = parcel.readInt();
        spoilRatePercent = parcel.readDouble();
        isAggregatedAmount = parcel.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(product, 0);
        dest.writeString(lastPurchased);
        dest.writeString(lastUsed);
        dest.writeDouble(stockAmount);
        dest.writeDouble(stockAmountOpened);
        dest.writeDouble(stockAmountAggregated);
        dest.writeDouble(stockAmountOpenedAggregated);
        dest.writeParcelable(quantityUnitPurchase, 0);
        dest.writeParcelable(quantityUnitStock, 0);
        dest.writeString(lastPrice);
        dest.writeString(nextBestBeforeDate);
        dest.writeParcelable(location, 0);
        dest.writeInt(averageShelfLifeDays);
        dest.writeDouble(spoilRatePercent);
        dest.writeInt(isAggregatedAmount);
    }

    public static final Creator<ProductDetails> CREATOR = new Creator<ProductDetails>() {

        @Override
        public ProductDetails createFromParcel(Parcel in) {
            return new ProductDetails(in);
        }

        @Override
        public ProductDetails[] newArray(int size) {
            return new ProductDetails[size];
        }
    };

    public Product getProduct() {
        return product;
    }

    public String getLastPurchased() {
        return lastPurchased;
    }

    public String getLastUsed() {
        return lastUsed;
    }

    public double getStockAmount() {
        return stockAmount;
    }

    public double getStockAmountOpened() {
        return stockAmountOpened;
    }

    public double getStockAmountAggregated() {
        return stockAmountAggregated;
    }

    public double getStockAmountOpenedAggregated() {
        return stockAmountOpenedAggregated;
    }

    public QuantityUnit getQuantityUnitPurchase() {
        return quantityUnitPurchase;
    }

    public QuantityUnit getQuantityUnitStock() {
        return quantityUnitStock;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    public String getNextBestBeforeDate() {
        return nextBestBeforeDate;
    }

    public Location getLocation() {
        return location;
    }

    public int getAverageShelfLifeDays() {
        return averageShelfLifeDays;
    }

    public double getSpoilRatePercent() {
        return spoilRatePercent;
    }

    public int getIsAggregatedAmount() {
        return isAggregatedAmount;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @NonNull
    @Override
    public String toString() {
        return "ProductDetails(" + product + ')';
    }
}
