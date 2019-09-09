package com.bitacad.main;

import java.time.LocalDate;

interface Imprumutabil {
    void imprumuta(LocalDate dataImprumut) throws Exception;

    void returneaza(LocalDate dataRetur) throws Exception;

    double calculPenalizare(LocalDate dataRetur);
}
