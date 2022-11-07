public class com.zong.android.engine.activities.ZongPricePointsElement implements android.os.Parcelable {
	 /* # interfaces */
	 /* # static fields */
	 public static final android.os.Parcelable$Creator CREATOR;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/Parcelable$Creator", */
	 /* "<", */
	 /* "Lcom/zong/android/engine/activities/ZongPricePointsElement;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
private java.lang.String a;
private Float b;
private Integer c;
private java.lang.String d;
private java.lang.String e;
/* # direct methods */
static com.zong.android.engine.activities.ZongPricePointsElement ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/zong/android/engine/activities/a; */
/* invoke-direct {v0}, Lcom/zong/android/engine/activities/a;-><init>()V */
return;
} // .end method
 com.zong.android.engine.activities.ZongPricePointsElement ( ) { //synthethic
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Lcom/zong/android/engine/activities/ZongPricePointsElement;-><init>(Landroid/os/Parcel;B)V */
return;
} // .end method
private com.zong.android.engine.activities.ZongPricePointsElement ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.a = v0;
v0 = (( android.os.Parcel ) p1 ).readFloat ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F
/* iput v0, p0, Lcom/zong/android/engine/activities/ZongPricePointsElement;->b:F */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Lcom/zong/android/engine/activities/ZongPricePointsElement;->c:I */
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.d = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.e = v0;
return;
} // .end method
public com.zong.android.engine.activities.ZongPricePointsElement ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.a = p1;
/* iput p2, p0, Lcom/zong/android/engine/activities/ZongPricePointsElement;->b:F */
/* iput p3, p0, Lcom/zong/android/engine/activities/ZongPricePointsElement;->c:I */
this.d = p4;
this.e = p5;
return;
} // .end method
/* # virtual methods */
public final java.lang.String a ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public final java.lang.String b ( ) {
/* .locals 1 */
v0 = this.d;
} // .end method
public final java.lang.String c ( ) {
/* .locals 1 */
v0 = this.e;
} // .end method
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Float getAmount ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/zong/android/engine/activities/ZongPricePointsElement;->b:F */
} // .end method
public Integer getQuantity ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/zong/android/engine/activities/ZongPricePointsElement;->c:I */
} // .end method
public final java.lang.String toString ( ) {
/* .locals 3 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "key: "; // const-string v1, "key: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "amount: "; // const-string v1, "amount: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lcom/zong/android/engine/activities/ZongPricePointsElement;->b:F */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "quantity: "; // const-string v1, "quantity: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lcom/zong/android/engine/activities/ZongPricePointsElement;->c:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "itemDesc: "; // const-string v1, "itemDesc: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.d;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "label: "; // const-string v1, "label: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.e;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
v0 = this.a;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
/* iget v0, p0, Lcom/zong/android/engine/activities/ZongPricePointsElement;->b:F */
(( android.os.Parcel ) p1 ).writeFloat ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V
/* iget v0, p0, Lcom/zong/android/engine/activities/ZongPricePointsElement;->c:I */
(( android.os.Parcel ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
v0 = this.d;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.e;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
return;
} // .end method
