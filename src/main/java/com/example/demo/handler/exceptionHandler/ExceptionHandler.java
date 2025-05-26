package com.example.demo.handler.exceptionHandler;

import com.example.demo.PojaGenerated;

@PojaGenerated
public interface ExceptionHandler<R> {
  R handle(Throwable throwable);
}
