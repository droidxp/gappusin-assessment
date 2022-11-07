public class inal extends java.lang.Enum {
	 /* .source "EventType.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum", */
	 /* "<", */
	 /* "Lcom/jumptap/adtag/events/EventType;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
private static final com.jumptap.adtag.events.EventType $VALUES; //synthetic
public static final com.jumptap.adtag.events.EventType adVideo100;
public static final com.jumptap.adtag.events.EventType adVideo25;
public static final com.jumptap.adtag.events.EventType adVideo50;
public static final com.jumptap.adtag.events.EventType adVideo75;
public static final com.jumptap.adtag.events.EventType click;
public static final com.jumptap.adtag.events.EventType dismiss;
public static final com.jumptap.adtag.events.EventType impression;
public static final com.jumptap.adtag.events.EventType install;
public static final com.jumptap.adtag.events.EventType interact;
public static final com.jumptap.adtag.events.EventType run;
/* # instance fields */
private final java.lang.String value;
/* # direct methods */
static inal ( ) {
	 /* .locals 9 */
	 /* .prologue */
	 int v8 = 4; // const/4 v8, 0x4
	 int v7 = 3; // const/4 v7, 0x3
	 int v6 = 2; // const/4 v6, 0x2
	 int v5 = 1; // const/4 v5, 0x1
	 int v4 = 0; // const/4 v4, 0x0
	 /* .line 4 */
	 /* new-instance v0, Lcom/jumptap/adtag/events/EventType; */
	 final String v1 = "run"; // const-string v1, "run"
	 final String v2 = "run"; // const-string v2, "run"
	 /* invoke-direct {v0, v1, v4, v2}, Lcom/jumptap/adtag/events/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 5 */
	 /* new-instance v0, Lcom/jumptap/adtag/events/EventType; */
	 final String v1 = "install"; // const-string v1, "install"
	 final String v2 = "install"; // const-string v2, "install"
	 /* invoke-direct {v0, v1, v5, v2}, Lcom/jumptap/adtag/events/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 7 */
	 /* new-instance v0, Lcom/jumptap/adtag/events/EventType; */
	 final String v1 = "impression"; // const-string v1, "impression"
	 final String v2 = "impression"; // const-string v2, "impression"
	 /* invoke-direct {v0, v1, v6, v2}, Lcom/jumptap/adtag/events/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 8 */
	 /* new-instance v0, Lcom/jumptap/adtag/events/EventType; */
	 final String v1 = "click"; // const-string v1, "click"
	 final String v2 = "click"; // const-string v2, "click"
	 /* invoke-direct {v0, v1, v7, v2}, Lcom/jumptap/adtag/events/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 10 */
	 /* new-instance v0, Lcom/jumptap/adtag/events/EventType; */
	 final String v1 = "interact"; // const-string v1, "interact"
	 final String v2 = "interact"; // const-string v2, "interact"
	 /* invoke-direct {v0, v1, v8, v2}, Lcom/jumptap/adtag/events/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 12 */
	 /* new-instance v0, Lcom/jumptap/adtag/events/EventType; */
	 final String v1 = "adVideo25"; // const-string v1, "adVideo25"
	 int v2 = 5; // const/4 v2, 0x5
	 final String v3 = "25view"; // const-string v3, "25view"
	 /* invoke-direct {v0, v1, v2, v3}, Lcom/jumptap/adtag/events/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 13 */
	 /* new-instance v0, Lcom/jumptap/adtag/events/EventType; */
	 final String v1 = "adVideo50"; // const-string v1, "adVideo50"
	 int v2 = 6; // const/4 v2, 0x6
	 final String v3 = "50view"; // const-string v3, "50view"
	 /* invoke-direct {v0, v1, v2, v3}, Lcom/jumptap/adtag/events/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 14 */
	 /* new-instance v0, Lcom/jumptap/adtag/events/EventType; */
	 final String v1 = "adVideo75"; // const-string v1, "adVideo75"
	 int v2 = 7; // const/4 v2, 0x7
	 final String v3 = "75view"; // const-string v3, "75view"
	 /* invoke-direct {v0, v1, v2, v3}, Lcom/jumptap/adtag/events/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 15 */
	 /* new-instance v0, Lcom/jumptap/adtag/events/EventType; */
	 final String v1 = "adVideo100"; // const-string v1, "adVideo100"
	 /* const/16 v2, 0x8 */
	 final String v3 = "100view"; // const-string v3, "100view"
	 /* invoke-direct {v0, v1, v2, v3}, Lcom/jumptap/adtag/events/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 16 */
	 /* new-instance v0, Lcom/jumptap/adtag/events/EventType; */
	 final String v1 = "dismiss"; // const-string v1, "dismiss"
	 /* const/16 v2, 0x9 */
	 final String v3 = "dismiss"; // const-string v3, "dismiss"
	 /* invoke-direct {v0, v1, v2, v3}, Lcom/jumptap/adtag/events/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 3 */
	 /* const/16 v0, 0xa */
	 /* new-array v0, v0, [Lcom/jumptap/adtag/events/EventType; */
	 v1 = com.jumptap.adtag.events.EventType.run;
	 /* aput-object v1, v0, v4 */
	 v1 = com.jumptap.adtag.events.EventType.install;
	 /* aput-object v1, v0, v5 */
	 v1 = com.jumptap.adtag.events.EventType.impression;
	 /* aput-object v1, v0, v6 */
	 v1 = com.jumptap.adtag.events.EventType.click;
	 /* aput-object v1, v0, v7 */
	 v1 = com.jumptap.adtag.events.EventType.interact;
	 /* aput-object v1, v0, v8 */
	 int v1 = 5; // const/4 v1, 0x5
	 v2 = com.jumptap.adtag.events.EventType.adVideo25;
	 /* aput-object v2, v0, v1 */
	 int v1 = 6; // const/4 v1, 0x6
	 v2 = com.jumptap.adtag.events.EventType.adVideo50;
	 /* aput-object v2, v0, v1 */
	 int v1 = 7; // const/4 v1, 0x7
	 v2 = com.jumptap.adtag.events.EventType.adVideo75;
	 /* aput-object v2, v0, v1 */
	 /* const/16 v1, 0x8 */
	 v2 = com.jumptap.adtag.events.EventType.adVideo100;
	 /* aput-object v2, v0, v1 */
	 /* const/16 v1, 0x9 */
	 v2 = com.jumptap.adtag.events.EventType.dismiss;
	 /* aput-object v2, v0, v1 */
	 return;
} // .end method
private inal ( ) {
	 /* .locals 0 */
	 /* .param p3, "value" # Ljava/lang/String; */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/lang/String;", */
	 /* ")V" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 20 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
/* .line 21 */
this.value = p3;
/* .line 22 */
return;
} // .end method
public static com.jumptap.adtag.events.EventType valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 3 */
/* const-class v0, Lcom/jumptap/adtag/events/EventType; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/jumptap/adtag/events/EventType; */
} // .end method
public static com.jumptap.adtag.events.EventType values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 3 */
v0 = com.jumptap.adtag.events.EventType.$VALUES;
(( com.jumptap.adtag.events.EventType ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/jumptap/adtag/events/EventType;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/jumptap/adtag/events/EventType; */
} // .end method
/* # virtual methods */
public final java.lang.String value ( ) {
/* .locals 1 */
/* .prologue */
/* .line 24 */
v0 = this.value;
} // .end method
