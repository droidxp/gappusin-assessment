public class org.codehaus.jackson.JsonGenerationException extends org.codehaus.jackson.JsonProcessingException {
	 /* .source "JsonGenerationException.java" */
	 /* # static fields */
	 static final Long serialVersionUID;
	 /* # direct methods */
	 public org.codehaus.jackson.JsonGenerationException ( ) {
		 /* .locals 1 */
		 /* .param p1, "msg" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 20 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* check-cast v0, Lorg/codehaus/jackson/JsonLocation; */
		 /* invoke-direct {p0, p1, v0}, Lorg/codehaus/jackson/JsonProcessingException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
		 /* .line 21 */
		 return;
	 } // .end method
	 public org.codehaus.jackson.JsonGenerationException ( ) {
		 /* .locals 1 */
		 /* .param p1, "msg" # Ljava/lang/String; */
		 /* .param p2, "rootCause" # Ljava/lang/Throwable; */
		 /* .prologue */
		 /* .line 25 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* check-cast v0, Lorg/codehaus/jackson/JsonLocation; */
		 /* invoke-direct {p0, p1, v0, p2}, Lorg/codehaus/jackson/JsonProcessingException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;Ljava/lang/Throwable;)V */
		 /* .line 26 */
		 return;
	 } // .end method
	 public org.codehaus.jackson.JsonGenerationException ( ) {
		 /* .locals 0 */
		 /* .param p1, "rootCause" # Ljava/lang/Throwable; */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0, p1}, Lorg/codehaus/jackson/JsonProcessingException;-><init>(Ljava/lang/Throwable;)V */
		 /* .line 16 */
		 return;
	 } // .end method
