public class com.jumptap.adtag.media.VideoCacheItem {
	 /* .source "VideoCacheItem.java" */
	 /* # static fields */
	 public static final java.lang.String URL_DELIMITER;
	 /* # instance fields */
	 private java.lang.String adID;
	 private java.lang.String date;
	 private Integer id;
	 /* # direct methods */
	 public com.jumptap.adtag.media.VideoCacheItem ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 14 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 15 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* invoke-direct {p0, v0, v1, v1}, Lcom/jumptap/adtag/media/VideoCacheItem;->init(ILjava/lang/String;Ljava/lang/String;)V */
		 /* .line 16 */
		 return;
	 } // .end method
	 public com.jumptap.adtag.media.VideoCacheItem ( ) {
		 /* .locals 0 */
		 /* .param p1, "id" # I */
		 /* .param p2, "adid" # Ljava/lang/String; */
		 /* .param p3, "date" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 24 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/jumptap/adtag/media/VideoCacheItem;->init(ILjava/lang/String;Ljava/lang/String;)V */
		 /* .line 25 */
		 return;
	 } // .end method
	 public com.jumptap.adtag.media.VideoCacheItem ( ) {
		 /* .locals 1 */
		 /* .param p1, "adid" # Ljava/lang/String; */
		 /* .param p2, "date" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 19 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* invoke-direct {p0, v0, p1, p2}, Lcom/jumptap/adtag/media/VideoCacheItem;->init(ILjava/lang/String;Ljava/lang/String;)V */
		 /* .line 20 */
		 return;
	 } // .end method
	 private void init ( Integer p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 0 */
		 /* .param p1, "id" # I */
		 /* .param p2, "adid" # Ljava/lang/String; */
		 /* .param p3, "date" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 57 */
		 /* iput p1, p0, Lcom/jumptap/adtag/media/VideoCacheItem;->id:I */
		 /* .line 58 */
		 this.adID = p2;
		 /* .line 59 */
		 this.date = p3;
		 /* .line 60 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getAdID ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 36 */
		 v0 = this.adID;
	 } // .end method
	 public java.lang.String getDate ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 48 */
		 v0 = this.date;
	 } // .end method
	 public Integer getId ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 28 */
		 /* iget v0, p0, Lcom/jumptap/adtag/media/VideoCacheItem;->id:I */
	 } // .end method
	 public void setAdID ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "adID" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 40 */
		 this.adID = p1;
		 /* .line 41 */
		 return;
	 } // .end method
	 public void setDate ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "date" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 44 */
		 this.date = p1;
		 /* .line 45 */
		 return;
	 } // .end method
	 public void setId ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "id" # I */
		 /* .prologue */
		 /* .line 32 */
		 /* iput p1, p0, Lcom/jumptap/adtag/media/VideoCacheItem;->id:I */
		 /* .line 33 */
		 return;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 53 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "id="; // const-string v1, "id="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/jumptap/adtag/media/VideoCacheItem;->id:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = " ,adID="; // const-string v1, " ,adID="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.adID;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = " ,date="; // const-string v1, " ,date="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.date;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
