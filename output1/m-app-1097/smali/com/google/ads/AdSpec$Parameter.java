public class com.google.ads.AdSpec$Parameter {
	 /* .source "AdSpec.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/AdSpec; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "Parameter" */
} // .end annotation
/* # instance fields */
private final java.lang.String mName;
private final java.lang.String mValue;
/* # direct methods */
public com.google.ads.AdSpec$Parameter ( ) {
/* .locals 2 */
/* .param p1, "name" # Ljava/lang/String; */
/* .param p2, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 55 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 56 */
/* if-nez p1, :cond_0 */
/* .line 57 */
/* new-instance v0, Ljava/lang/NullPointerException; */
final String v1 = "Parameter name cannot be null."; // const-string v1, "Parameter name cannot be null."
/* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 60 */
} // :cond_0
/* if-nez p2, :cond_1 */
/* .line 61 */
/* new-instance v0, Ljava/lang/NullPointerException; */
final String v1 = "Parameter value cannot be null."; // const-string v1, "Parameter value cannot be null."
/* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 64 */
} // :cond_1
this.mName = p1;
/* .line 65 */
this.mValue = p2;
/* .line 66 */
return;
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 6 */
/* .param p1, "o" # Ljava/lang/Object; */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 85 */
/* if-ne p0, p1, :cond_0 */
/* move v2, v5 */
/* .line 94 */
} // :goto_0
/* .line 89 */
} // :cond_0
/* instance-of v2, p1, Lcom/google/ads/AdSpec$Parameter; */
/* if-nez v2, :cond_1 */
/* move v2, v4 */
/* .line 90 */
/* .line 93 */
} // :cond_1
/* move-object v0, p1 */
/* check-cast v0, Lcom/google/ads/AdSpec$Parameter; */
/* move-object v1, v0 */
/* .line 94 */
/* .local v1, "p":Lcom/google/ads/AdSpec$Parameter; */
v2 = this.mName;
v3 = this.mName;
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.mValue;
v3 = this.mValue;
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* move v2, v5 */
} // :cond_2
/* move v2, v4 */
} // .end method
public java.lang.String getName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 72 */
v0 = this.mName;
} // .end method
public java.lang.String getValue ( ) {
/* .locals 1 */
/* .prologue */
/* .line 79 */
v0 = this.mValue;
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .prologue */
/* .line 100 */
v0 = this.mName;
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
/* mul-int/lit16 v0, v0, 0x1387 */
v1 = this.mValue;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* add-int/2addr v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 106 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Parameter("; // const-string v1, "Parameter("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.mName;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ","; // const-string v1, ","
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.mValue;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
