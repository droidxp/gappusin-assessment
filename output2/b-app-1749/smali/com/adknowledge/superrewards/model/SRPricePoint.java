public class com.adknowledge.superrewards.model.SRPricePoint implements java.io.Serializable {
	 /* .source "SRPricePoint.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.String AMOUNT;
	 public static final java.lang.String ENTRYPOINTURL;
	 public static final java.lang.String LOCAL_AMOUNT;
	 public static final java.lang.String LOCAL_TEXT;
	 public static final java.lang.String POINTS;
	 public static final java.lang.String PRICE;
	 public static final java.lang.String US_AMOUNT;
	 public static final java.lang.String US_TEXT;
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 private java.lang.String amount;
	 private java.lang.String entrypointurl;
	 private java.lang.String local_amount;
	 private java.lang.String local_currency;
	 private java.lang.String local_text;
	 private Integer points;
	 private java.lang.String text;
	 private java.lang.String us_amount;
	 private java.lang.String us_text;
	 /* # direct methods */
	 public com.adknowledge.superrewards.model.SRPricePoint ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 5 */
		 /* .param p1, "obj" # Ljava/lang/Object; */
		 /* .prologue */
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 117 */
		 /* if-ne p0, p1, :cond_1 */
		 /* .line 141 */
	 } // :cond_0
} // :goto_0
/* .line 120 */
} // :cond_1
/* if-nez p1, :cond_2 */
/* move v1, v2 */
/* .line 121 */
/* .line 123 */
} // :cond_2
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* if-eq v3, v4, :cond_3 */
/* move v1, v2 */
/* .line 124 */
} // :cond_3
/* move-object v0, p1 */
/* .line 126 */
/* check-cast v0, Lcom/adknowledge/superrewards/model/SRPricePoint; */
/* .line 127 */
/* .local v0, "other":Lcom/adknowledge/superrewards/model/SRPricePoint; */
v3 = this.amount;
/* if-nez v3, :cond_4 */
/* .line 128 */
v3 = this.amount;
if ( v3 != null) { // if-eqz v3, :cond_5
/* move v1, v2 */
/* .line 129 */
/* .line 131 */
} // :cond_4
v3 = this.amount;
v4 = this.amount;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_5 */
/* move v1, v2 */
/* .line 132 */
/* .line 134 */
} // :cond_5
v3 = this.text;
/* if-nez v3, :cond_6 */
/* .line 135 */
v3 = this.text;
if ( v3 != null) { // if-eqz v3, :cond_0
/* move v1, v2 */
/* .line 136 */
/* .line 138 */
} // :cond_6
v3 = this.text;
v4 = this.text;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_0 */
/* move v1, v2 */
/* .line 139 */
} // .end method
public java.lang.String getAmount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 99 */
v0 = this.amount;
} // .end method
public java.lang.String getEntrypointurl ( ) {
/* .locals 1 */
/* .prologue */
/* .line 95 */
v0 = this.entrypointurl;
} // .end method
public java.lang.String getLocalAmount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 79 */
v0 = this.local_amount;
} // .end method
public java.lang.String getLocalText ( ) {
/* .locals 1 */
/* .prologue */
/* .line 59 */
v0 = this.local_text;
} // .end method
public Integer getPoints ( ) {
/* .locals 1 */
/* .prologue */
/* .line 71 */
/* iget v0, p0, Lcom/adknowledge/superrewards/model/SRPricePoint;->points:I */
} // .end method
public java.lang.String getUsAmount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 87 */
v0 = this.us_amount;
} // .end method
public java.lang.String getUsText ( ) {
/* .locals 1 */
/* .prologue */
/* .line 51 */
v0 = this.us_text;
} // .end method
public Integer hashCode ( ) {
/* .locals 5 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 108 */
/* const/16 v0, 0x1f */
/* .line 109 */
/* .local v0, "prime":I */
int v1 = 1; // const/4 v1, 0x1
/* .line 110 */
/* .local v1, "result":I */
v2 = this.amount;
/* if-nez v2, :cond_0 */
/* move v2, v3 */
} // :goto_0
/* add-int/lit8 v1, v2, 0x1f */
/* .line 111 */
/* mul-int/lit8 v2, v1, 0x1f */
v4 = this.text;
/* if-nez v4, :cond_1 */
} // :goto_1
/* add-int v1, v2, v3 */
/* .line 112 */
/* .line 110 */
} // :cond_0
v2 = this.amount;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* .line 111 */
} // :cond_1
v3 = this.text;
v3 = (( java.lang.String ) v3 ).hashCode ( ); // invoke-virtual {v3}, Ljava/lang/String;->hashCode()I
} // .end method
public void setAmount ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "amount" # Ljava/lang/String; */
/* .prologue */
/* .line 103 */
this.amount = p1;
/* .line 104 */
return;
} // .end method
public void setEntrypointurl ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 91 */
this.entrypointurl = p1;
/* .line 92 */
return;
} // .end method
public void setLocalAmount ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "local_amount" # Ljava/lang/String; */
/* .prologue */
/* .line 75 */
this.local_amount = p1;
/* .line 76 */
return;
} // .end method
public void setLocalText ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 63 */
this.local_text = p1;
/* .line 64 */
return;
} // .end method
public void setPoints ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "points" # Ljava/lang/String; */
/* .prologue */
/* .line 67 */
v0 = java.lang.Integer .parseInt ( p1 );
/* iput v0, p0, Lcom/adknowledge/superrewards/model/SRPricePoint;->points:I */
/* .line 68 */
return;
} // .end method
public void setUsAmount ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "us_amount" # Ljava/lang/String; */
/* .prologue */
/* .line 83 */
this.us_amount = p1;
/* .line 84 */
return;
} // .end method
public void setUsText ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 55 */
this.us_text = p1;
/* .line 56 */
return;
} // .end method
