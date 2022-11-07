public class com.google.i18n.phonenumbers.NumberParseException extends java.lang.Exception {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType; */
	 /* } */
} // .end annotation
/* # instance fields */
private com.google.i18n.phonenumbers.NumberParseException$ErrorType errorType;
private java.lang.String message;
/* # direct methods */
public com.google.i18n.phonenumbers.NumberParseException ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
	 this.message = p2;
	 this.errorType = p1;
	 return;
} // .end method
/* # virtual methods */
public com.google.i18n.phonenumbers.NumberParseException$ErrorType getErrorType ( ) {
	 /* .locals 1 */
	 v0 = this.errorType;
} // .end method
public java.lang.String toString ( ) {
	 /* .locals 2 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "Error type: "; // const-string v1, "Error type: "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v1 = this.errorType;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 final String v1 = "."; // const-string v1, "."
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v1 = this.message;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
