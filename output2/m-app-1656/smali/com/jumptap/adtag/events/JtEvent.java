public class com.jumptap.adtag.events.JtEvent {
	 /* .source "JtEvent.java" */
	 /* # instance fields */
	 private java.lang.String date;
	 private com.jumptap.adtag.events.EventType eventType;
	 private Integer id;
	 private java.lang.String url;
	 /* # direct methods */
	 public com.jumptap.adtag.events.JtEvent ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 13 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 14 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* invoke-direct {p0, v0, v1, v1, v1}, Lcom/jumptap/adtag/events/JtEvent;->initEvent(ILjava/lang/String;Lcom/jumptap/adtag/events/EventType;Ljava/lang/String;)V */
		 /* .line 15 */
		 return;
	 } // .end method
	 public com.jumptap.adtag.events.JtEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "id" # I */
		 /* .param p2, "url" # Ljava/lang/String; */
		 /* .param p3, "eventType" # Lcom/jumptap/adtag/events/EventType; */
		 /* .param p4, "date" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 21 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 22 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumptap/adtag/events/JtEvent;->initEvent(ILjava/lang/String;Lcom/jumptap/adtag/events/EventType;Ljava/lang/String;)V */
		 /* .line 23 */
		 return;
	 } // .end method
	 public com.jumptap.adtag.events.JtEvent ( ) {
		 /* .locals 1 */
		 /* .param p1, "url" # Ljava/lang/String; */
		 /* .param p2, "eventType" # Lcom/jumptap/adtag/events/EventType; */
		 /* .param p3, "date" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 18 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* invoke-direct {p0, v0, p1, p2, p3}, Lcom/jumptap/adtag/events/JtEvent;->initEvent(ILjava/lang/String;Lcom/jumptap/adtag/events/EventType;Ljava/lang/String;)V */
		 /* .line 19 */
		 return;
	 } // .end method
	 private void initEvent ( Integer p0, java.lang.String p1, com.jumptap.adtag.events.EventType p2, java.lang.String p3 ) {
		 /* .locals 0 */
		 /* .param p1, "id" # I */
		 /* .param p2, "url" # Ljava/lang/String; */
		 /* .param p3, "eventType" # Lcom/jumptap/adtag/events/EventType; */
		 /* .param p4, "date" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 63 */
		 /* iput p1, p0, Lcom/jumptap/adtag/events/JtEvent;->id:I */
		 /* .line 64 */
		 this.url = p2;
		 /* .line 65 */
		 this.eventType = p3;
		 /* .line 66 */
		 this.date = p4;
		 /* .line 67 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getDate ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 50 */
		 v0 = this.date;
	 } // .end method
	 public com.jumptap.adtag.events.EventType getEventType ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 42 */
		 v0 = this.eventType;
	 } // .end method
	 public Integer getId ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 26 */
		 /* iget v0, p0, Lcom/jumptap/adtag/events/JtEvent;->id:I */
	 } // .end method
	 public java.lang.String getUrl ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 34 */
		 v0 = this.url;
	 } // .end method
	 public void setDate ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "date" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 54 */
		 this.date = p1;
		 /* .line 55 */
		 return;
	 } // .end method
	 public void setEventType ( com.jumptap.adtag.events.EventType p0 ) {
		 /* .locals 0 */
		 /* .param p1, "eventType" # Lcom/jumptap/adtag/events/EventType; */
		 /* .prologue */
		 /* .line 46 */
		 this.eventType = p1;
		 /* .line 47 */
		 return;
	 } // .end method
	 public void setId ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "id" # I */
		 /* .prologue */
		 /* .line 30 */
		 /* iput p1, p0, Lcom/jumptap/adtag/events/JtEvent;->id:I */
		 /* .line 31 */
		 return;
	 } // .end method
	 public void setUrl ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "url" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 38 */
		 this.url = p1;
		 /* .line 39 */
		 return;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 59 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "id="; // const-string v1, "id="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/jumptap/adtag/events/JtEvent;->id:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = " ,eventType="; // const-string v1, " ,eventType="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.eventType;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = " ,date="; // const-string v1, " ,date="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.date;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = " ,url="; // const-string v1, " ,url="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.url;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
