public class org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult {
	 /* .source "DoubleMetaphone.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/commons/codec/language/DoubleMetaphone; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "DoubleMetaphoneResult" */
} // .end annotation
/* # instance fields */
private final java.lang.StringBuilder alternate;
private final Integer maxLength;
private final java.lang.StringBuilder primary;
final org.apache.commons.codec.language.DoubleMetaphone this$0; //synthetic
/* # direct methods */
public org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult ( ) {
/* .locals 2 */
/* .param p2, "maxLength" # I */
/* .prologue */
/* .line 941 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 937 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = this.this$0;
v1 = (( org.apache.commons.codec.language.DoubleMetaphone ) v1 ).getMaxCodeLen ( ); // invoke-virtual {v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->getMaxCodeLen()I
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
this.primary = v0;
/* .line 938 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = this.this$0;
v1 = (( org.apache.commons.codec.language.DoubleMetaphone ) v1 ).getMaxCodeLen ( ); // invoke-virtual {v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->getMaxCodeLen()I
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
this.alternate = v0;
/* .line 942 */
/* iput p2, p0, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->maxLength:I */
/* .line 943 */
return;
} // .end method
/* # virtual methods */
public void append ( Object p0 ) {
/* .locals 0 */
/* .param p1, "value" # C */
/* .prologue */
/* .line 946 */
(( org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult ) p0 ).appendPrimary ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->appendPrimary(C)V
/* .line 947 */
(( org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult ) p0 ).appendAlternate ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->appendAlternate(C)V
/* .line 948 */
return;
} // .end method
public void append ( Object p0, Object p1 ) {
/* .locals 0 */
/* .param p1, "primary" # C */
/* .param p2, "alternate" # C */
/* .prologue */
/* .line 951 */
(( org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult ) p0 ).appendPrimary ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->appendPrimary(C)V
/* .line 952 */
(( org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult ) p0 ).appendAlternate ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->appendAlternate(C)V
/* .line 953 */
return;
} // .end method
public void append ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 968 */
(( org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult ) p0 ).appendPrimary ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->appendPrimary(Ljava/lang/String;)V
/* .line 969 */
(( org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult ) p0 ).appendAlternate ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->appendAlternate(Ljava/lang/String;)V
/* .line 970 */
return;
} // .end method
public void append ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 0 */
/* .param p1, "primary" # Ljava/lang/String; */
/* .param p2, "alternate" # Ljava/lang/String; */
/* .prologue */
/* .line 973 */
(( org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult ) p0 ).appendPrimary ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->appendPrimary(Ljava/lang/String;)V
/* .line 974 */
(( org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult ) p0 ).appendAlternate ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->appendAlternate(Ljava/lang/String;)V
/* .line 975 */
return;
} // .end method
public void appendAlternate ( Object p0 ) {
/* .locals 2 */
/* .param p1, "value" # C */
/* .prologue */
/* .line 962 */
v0 = this.alternate;
v0 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
/* iget v1, p0, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->maxLength:I */
/* if-ge v0, v1, :cond_0 */
/* .line 963 */
v0 = this.alternate;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 965 */
} // :cond_0
return;
} // .end method
public void appendAlternate ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 987 */
/* iget v1, p0, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->maxLength:I */
v2 = this.alternate;
v2 = (( java.lang.StringBuilder ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
/* sub-int v0, v1, v2 */
/* .line 988 */
/* .local v0, "addChars":I */
v1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-gt v1, v0, :cond_0 */
/* .line 989 */
v1 = this.alternate;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 993 */
} // :goto_0
return;
/* .line 991 */
} // :cond_0
v1 = this.alternate;
int v2 = 0; // const/4 v2, 0x0
(( java.lang.String ) p1 ).substring ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // .end method
public void appendPrimary ( Object p0 ) {
/* .locals 2 */
/* .param p1, "value" # C */
/* .prologue */
/* .line 956 */
v0 = this.primary;
v0 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
/* iget v1, p0, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->maxLength:I */
/* if-ge v0, v1, :cond_0 */
/* .line 957 */
v0 = this.primary;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 959 */
} // :cond_0
return;
} // .end method
public void appendPrimary ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 978 */
/* iget v1, p0, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->maxLength:I */
v2 = this.primary;
v2 = (( java.lang.StringBuilder ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
/* sub-int v0, v1, v2 */
/* .line 979 */
/* .local v0, "addChars":I */
v1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-gt v1, v0, :cond_0 */
/* .line 980 */
v1 = this.primary;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 984 */
} // :goto_0
return;
/* .line 982 */
} // :cond_0
v1 = this.primary;
int v2 = 0; // const/4 v2, 0x0
(( java.lang.String ) p1 ).substring ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // .end method
public java.lang.String getAlternate ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1000 */
v0 = this.alternate;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public java.lang.String getPrimary ( ) {
/* .locals 1 */
/* .prologue */
/* .line 996 */
v0 = this.primary;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public Boolean isComplete ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1004 */
v0 = this.primary;
v0 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
/* iget v1, p0, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->maxLength:I */
/* if-lt v0, v1, :cond_0 */
v0 = this.alternate;
v0 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
/* iget v1, p0, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->maxLength:I */
/* if-lt v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
