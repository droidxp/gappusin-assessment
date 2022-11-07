public class org.codehaus.jackson.JsonProcessingException extends java.io.IOException {
	 /* .source "JsonProcessingException.java" */
	 /* # static fields */
	 static final Long serialVersionUID;
	 /* # instance fields */
	 protected org.codehaus.jackson.JsonLocation mLocation;
	 /* # direct methods */
	 protected org.codehaus.jackson.JsonProcessingException ( ) {
		 /* .locals 0 */
		 /* .param p1, "msg" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 31 */
		 /* invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
		 /* .line 32 */
		 return;
	 } // .end method
	 protected org.codehaus.jackson.JsonProcessingException ( ) {
		 /* .locals 1 */
		 /* .param p1, "msg" # Ljava/lang/String; */
		 /* .param p2, "rootCause" # Ljava/lang/Throwable; */
		 /* .prologue */
		 /* .line 41 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0, p2}, Lorg/codehaus/jackson/JsonProcessingException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;Ljava/lang/Throwable;)V */
		 /* .line 42 */
		 return;
	 } // .end method
	 protected org.codehaus.jackson.JsonProcessingException ( ) {
		 /* .locals 1 */
		 /* .param p1, "msg" # Ljava/lang/String; */
		 /* .param p2, "loc" # Lorg/codehaus/jackson/JsonLocation; */
		 /* .prologue */
		 /* .line 36 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0}, Lorg/codehaus/jackson/JsonProcessingException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;Ljava/lang/Throwable;)V */
		 /* .line 37 */
		 return;
	 } // .end method
	 protected org.codehaus.jackson.JsonProcessingException ( ) {
		 /* .locals 0 */
		 /* .param p1, "msg" # Ljava/lang/String; */
		 /* .param p2, "loc" # Lorg/codehaus/jackson/JsonLocation; */
		 /* .param p3, "rootCause" # Ljava/lang/Throwable; */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
		 /* .line 23 */
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 /* .line 24 */
			 (( org.codehaus.jackson.JsonProcessingException ) p0 ).initCause ( p3 ); // invoke-virtual {p0, p3}, Lorg/codehaus/jackson/JsonProcessingException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
			 /* .line 26 */
		 } // :cond_0
		 this.mLocation = p2;
		 /* .line 27 */
		 return;
	 } // .end method
	 protected org.codehaus.jackson.JsonProcessingException ( ) {
		 /* .locals 1 */
		 /* .param p1, "rootCause" # Ljava/lang/Throwable; */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 46 */
		 /* invoke-direct {p0, v0, v0, p1}, Lorg/codehaus/jackson/JsonProcessingException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;Ljava/lang/Throwable;)V */
		 /* .line 47 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.codehaus.jackson.JsonLocation getLocation ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 51 */
		 v0 = this.mLocation;
	 } // .end method
	 public java.lang.String getMessage ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 60 */
		 /* invoke-super {p0}, Ljava/io/IOException;->getMessage()Ljava/lang/String; */
		 /* .line 61 */
		 /* .local v1, "msg":Ljava/lang/String; */
		 /* if-nez v1, :cond_0 */
		 /* .line 62 */
		 final String v1 = "N/A"; // const-string v1, "N/A"
		 /* .line 64 */
	 } // :cond_0
	 (( org.codehaus.jackson.JsonProcessingException ) p0 ).getLocation ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonProcessingException;->getLocation()Lorg/codehaus/jackson/JsonLocation;
	 /* .line 65 */
	 /* .local v0, "loc":Lorg/codehaus/jackson/JsonLocation; */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 66 */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 /* .line 67 */
		 /* .local v2, "sb":Ljava/lang/StringBuilder; */
		 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 68 */
		 /* const/16 v3, 0xa */
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 /* .line 69 */
		 final String v3 = " at "; // const-string v3, " at "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 70 */
		 (( org.codehaus.jackson.JsonLocation ) v0 ).toString ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/JsonLocation;->toString()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 71 */
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 73 */
	 } // .end local v1 # "msg":Ljava/lang/String;
} // .end local v2 # "sb":Ljava/lang/StringBuilder;
} // :cond_1
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 78 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ": "; // const-string v1, ": "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( org.codehaus.jackson.JsonProcessingException ) p0 ).getMessage ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonProcessingException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
