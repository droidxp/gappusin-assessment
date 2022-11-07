public class org.codehaus.jackson.impl.DefaultPrettyPrinter implements org.codehaus.jackson.PrettyPrinter {
	 /* .source "DefaultPrettyPrinter.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/codehaus/jackson/impl/DefaultPrettyPrinter$Lf2SpacesIndenter;, */
	 /* Lorg/codehaus/jackson/impl/DefaultPrettyPrinter$FixedSpaceIndenter;, */
	 /* Lorg/codehaus/jackson/impl/DefaultPrettyPrinter$NopIndenter; */
	 /* } */
} // .end annotation
/* # instance fields */
protected org.codehaus.jackson.impl.Indenter _arrayIndenter;
protected Integer _nesting;
protected org.codehaus.jackson.impl.Indenter _objectIndenter;
protected Boolean _spacesInObjectEntries;
/* # direct methods */
public org.codehaus.jackson.impl.DefaultPrettyPrinter ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 58 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 25 */
	 /* new-instance v0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter$FixedSpaceIndenter; */
	 /* invoke-direct {v0}, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter$FixedSpaceIndenter;-><init>()V */
	 this._arrayIndenter = v0;
	 /* .line 33 */
	 /* new-instance v0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter$Lf2SpacesIndenter; */
	 /* invoke-direct {v0}, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter$Lf2SpacesIndenter;-><init>()V */
	 this._objectIndenter = v0;
	 /* .line 42 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_spacesInObjectEntries:Z */
	 /* .line 50 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput v0, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
	 /* .line 58 */
	 return;
} // .end method
/* # virtual methods */
public void beforeArrayValues ( org.codehaus.jackson.JsonGenerator p0 ) {
	 /* .locals 2 */
	 /* .param p1, "jg" # Lorg/codehaus/jackson/JsonGenerator; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException;, */
	 /* Lorg/codehaus/jackson/JsonGenerationException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 159 */
v0 = this._arrayIndenter;
/* iget v1, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* .line 160 */
return;
} // .end method
public void beforeObjectEntries ( org.codehaus.jackson.JsonGenerator p0 ) {
/* .locals 2 */
/* .param p1, "jg" # Lorg/codehaus/jackson/JsonGenerator; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 95 */
v0 = this._objectIndenter;
/* iget v1, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* .line 96 */
return;
} // .end method
public void indentArraysWith ( org.codehaus.jackson.impl.Indenter p0 ) {
/* .locals 0 */
/* .param p1, "i" # Lorg/codehaus/jackson/impl/Indenter; */
/* .prologue */
/* .line 62 */
/* if-nez p1, :cond_0 */
/* new-instance p1, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter$NopIndenter; */
} // .end local p1 # "i":Lorg/codehaus/jackson/impl/Indenter;
/* invoke-direct {p1}, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter$NopIndenter;-><init>()V */
} // :cond_0
this._arrayIndenter = p1;
/* .line 63 */
return;
} // .end method
public void indentObjectsWith ( org.codehaus.jackson.impl.Indenter p0 ) {
/* .locals 0 */
/* .param p1, "i" # Lorg/codehaus/jackson/impl/Indenter; */
/* .prologue */
/* .line 67 */
/* if-nez p1, :cond_0 */
/* new-instance p1, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter$NopIndenter; */
} // .end local p1 # "i":Lorg/codehaus/jackson/impl/Indenter;
/* invoke-direct {p1}, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter$NopIndenter;-><init>()V */
} // :cond_0
this._objectIndenter = p1;
/* .line 68 */
return;
} // .end method
public void spacesInObjectEntries ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "b" # Z */
/* .prologue */
/* .line 70 */
/* iput-boolean p1, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_spacesInObjectEntries:Z */
return;
} // .end method
public void writeArrayValueSeparator ( org.codehaus.jackson.JsonGenerator p0 ) {
/* .locals 2 */
/* .param p1, "jg" # Lorg/codehaus/jackson/JsonGenerator; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 174 */
/* const/16 v0, 0x2c */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0 ); // invoke-virtual {p1, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw(C)V
/* .line 175 */
v0 = this._arrayIndenter;
/* iget v1, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* .line 176 */
return;
} // .end method
public void writeEndArray ( org.codehaus.jackson.JsonGenerator p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "jg" # Lorg/codehaus/jackson/JsonGenerator; */
/* .param p2, "nrOfValues" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 181 */
v0 = v0 = this._arrayIndenter;
/* if-nez v0, :cond_0 */
/* .line 182 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* .line 184 */
} // :cond_0
/* if-lez p2, :cond_1 */
/* .line 185 */
v0 = this._arrayIndenter;
/* iget v1, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* .line 189 */
} // :goto_0
/* const/16 v0, 0x5d */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0 ); // invoke-virtual {p1, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw(C)V
/* .line 190 */
return;
/* .line 187 */
} // :cond_1
/* const/16 v0, 0x20 */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0 ); // invoke-virtual {p1, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw(C)V
} // .end method
public void writeEndObject ( org.codehaus.jackson.JsonGenerator p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "jg" # Lorg/codehaus/jackson/JsonGenerator; */
/* .param p2, "nrOfEntries" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 136 */
v0 = v0 = this._objectIndenter;
/* if-nez v0, :cond_0 */
/* .line 137 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* .line 139 */
} // :cond_0
/* if-lez p2, :cond_1 */
/* .line 140 */
v0 = this._objectIndenter;
/* iget v1, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* .line 144 */
} // :goto_0
/* const/16 v0, 0x7d */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0 ); // invoke-virtual {p1, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw(C)V
/* .line 145 */
return;
/* .line 142 */
} // :cond_1
/* const/16 v0, 0x20 */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0 ); // invoke-virtual {p1, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw(C)V
} // .end method
public void writeObjectEntrySeparator ( org.codehaus.jackson.JsonGenerator p0 ) {
/* .locals 2 */
/* .param p1, "jg" # Lorg/codehaus/jackson/JsonGenerator; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 129 */
/* const/16 v0, 0x2c */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0 ); // invoke-virtual {p1, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw(C)V
/* .line 130 */
v0 = this._objectIndenter;
/* iget v1, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* .line 131 */
return;
} // .end method
public void writeObjectFieldValueSeparator ( org.codehaus.jackson.JsonGenerator p0 ) {
/* .locals 1 */
/* .param p1, "jg" # Lorg/codehaus/jackson/JsonGenerator; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 110 */
/* iget-boolean v0, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_spacesInObjectEntries:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 111 */
final String v0 = " : "; // const-string v0, " : "
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0 ); // invoke-virtual {p1, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw(Ljava/lang/String;)V
/* .line 115 */
} // :goto_0
return;
/* .line 113 */
} // :cond_0
/* const/16 v0, 0x3a */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0 ); // invoke-virtual {p1, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw(C)V
} // .end method
public void writeRootValueSeparator ( org.codehaus.jackson.JsonGenerator p0 ) {
/* .locals 1 */
/* .param p1, "jg" # Lorg/codehaus/jackson/JsonGenerator; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 80 */
/* const/16 v0, 0x20 */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0 ); // invoke-virtual {p1, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw(C)V
/* .line 81 */
return;
} // .end method
public void writeStartArray ( org.codehaus.jackson.JsonGenerator p0 ) {
/* .locals 1 */
/* .param p1, "jg" # Lorg/codehaus/jackson/JsonGenerator; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 150 */
v0 = v0 = this._arrayIndenter;
/* if-nez v0, :cond_0 */
/* .line 151 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* .line 153 */
} // :cond_0
/* const/16 v0, 0x5b */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0 ); // invoke-virtual {p1, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw(C)V
/* .line 154 */
return;
} // .end method
public void writeStartObject ( org.codehaus.jackson.JsonGenerator p0 ) {
/* .locals 1 */
/* .param p1, "jg" # Lorg/codehaus/jackson/JsonGenerator; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 86 */
/* const/16 v0, 0x7b */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0 ); // invoke-virtual {p1, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw(C)V
/* .line 87 */
v0 = v0 = this._objectIndenter;
/* if-nez v0, :cond_0 */
/* .line 88 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;->_nesting:I */
/* .line 90 */
} // :cond_0
return;
} // .end method
