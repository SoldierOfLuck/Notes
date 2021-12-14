package ru.lukmanov.notes.observe;

import ru.lukmanov.notes.data.Notes;

public interface Observer {
    void updateCardData(Notes notes);
}